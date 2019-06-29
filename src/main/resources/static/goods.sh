#! /bin/bash

## 商品线服务器部署

#set -m

qqsk="/usr/local/qqsk/v3project/"
goods="goods-server/"
mall="mall-route/"
member="member-server/"
order="order-server/"
version="-1.0-SNAPSHOT.jar"
jdwpset=""
jdwpset1="transport=dt_socket,server=y,suspend=n,address="
set -a serverjar
declare -A map=()
line=0

read -p "请输入服务名称" servername

set -a names
if [[ "$servername" = *good* ]];then
  names[$line]="qqsk-goods-server"
  serverjar[$line]=${goods}${names[$line]}${version}
  map[${serverjar[$line]}]=${jdwpset}"5005"
  ((line++))
fi
if [[ "$servername" = *member* ]];then
  names[$line]="qqsk-member-server"
  serverjar[$line]=$member${names[$line]}$version
  map[${serverjar[$line]}]=${jdwpset}"5008"
  ((line++))
fi
if [[ "$servername" = *order* ]];then
  names[$line]="qqsk-order-server"
  serverjar[$line]=$order${names[$line]}$version
  map[${serverjar[$line]}]=${jdwpset}"5007"
  ((line++))
fi
if [[ "$servername" = *mall* ]];then
  names[$line]="qqsk-mall-route"
  serverjar[$line]=$mall${names[$line]}$version
  map[${serverjar[$line]}]=${jdwpset}"5006"
  ((line++))
fi
line=${#serverjar[*]}
echo $line

if ((line < 1 ));then
	names[0]="qqsk-"
	serverjar[0]="goods-server/qqsk-goods-server-1.0-SNAPSHOT.jar"
    map[${serverjar[0]}]=${jdwpset}"5005"
	serverjar[1]="member-server/qqsk-member-server-1.0-SNAPSHOT.jar"
    map[${serverjar[1]}]=${jdwpset}"5008"
	serverjar[2]="order-server/qqsk-order-server-1.0-SNAPSHOT.jar"
    map[${serverjar[2]}]=${jdwpset}"5007"
	serverjar[3]="mall-route/qqsk-mall-route-1.0-SNAPSHOT.jar"
    map[${serverjar[3]}]=${jdwpset}"5006"
fi

echo ${names[*]}
echo ${serverjar[*]}

n1=${#names[*]}
line=${#serverjar[*]}
for((i=0;i<${n1};i++));
do
	echo ${names[$i]}
	PROCESS=`ps -ef|grep ${names[$i]} |grep -v PPID|awk '{print $2}'`
	for p in $PROCESS
	do
	  echo "Kill the process [ $p ]"
	  kill -9 $p
	done
done

cd $qqsk
pwd

for((i=0;i<${line};i++));
do
	echo '启动服务'${serverjar[$i]}
    echo "debugport"${map[${serverjar[$i]}]}
 	nohup java -jar -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=${map[${serverjar[$i]}]} ${serverjar[$i]} &
 	sleep 10
done
