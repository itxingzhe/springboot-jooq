#! /bin/bash

## 商品线服务器部署

#set -m

qqsk="/usr/local/qqsk/v3project/"
goods="goods-server/"
mall="mall-route/"
member="member-server/"
order="order-server/"
pG="qqsk-goods-server"
pM="qqsk-member-server"
pO="qqsk-order-server"
pC="qqsk-mall-route"
version="-1.0-SNAPSHOT.jar"
jdwpset=""
set -a serverjar
declare -A map=()
declare -A mapPath=()
line=0

read -p "请输入服务名称: " servername

read -p "请输入版本号: " ver
if [ ! -n "${ver}" ] ;then
	echo "默认版本号为：1.0"
else
	version="-"${ver}"-SNAPSHOT.jar"
fi

set -a names
if [[ "$servername" = *good* ]];then
  names[$line]=${pG}
  serverjar[$line]=${names[$line]}${version}
  map[${serverjar[$line]}]=${jdwpset}"5005"
  mapPath[${serverjar[$line]}]=${goods}
  ((line++))
fi
if [[ "$servername" = *member* ]];then
  names[$line]=${pM}
  serverjar[$line]=${names[$line]}$version
  map[${serverjar[$line]}]=${jdwpset}"5008"
  mapPath[${serverjar[$line]}]=${member}
  ((line++))
fi
if [[ "$servername" = *order* ]];then
  names[$line]=${pO}
  serverjar[$line]=${names[$line]}$version
  map[${serverjar[$line]}]=${jdwpset}"5007"
  mapPath[${serverjar[$line]}]=${order}
  ((line++))
fi
if [[ "$servername" = *mall* ]];then
  names[$line]=${pC}
  serverjar[$line]=${names[$line]}$version
  map[${serverjar[$line]}]=${jdwpset}"5006"
  mapPath[${serverjar[$line]}]=${mall}
  ((line++))
fi
line=${#serverjar[*]}
echo $line

if ((line < 1 ));then
	names[0]="qqsk-"
	serverjar[0]=${pG}$version
    map[${serverjar[0]}]=${jdwpset}"5005"
    mapPath[${serverjar[0]}]=${goods}
	serverjar[1]=${pM}$version
    map[${serverjar[1]}]=${jdwpset}"5008"
    mapPath[${serverjar[1]}]=${member}
	serverjar[2]=${pO}$version
    map[${serverjar[2]}]=${jdwpset}"5007"
    mapPath[${serverjar[2]}]=${order}
	serverjar[3]=${pC}$version
    map[${serverjar[3]}]=${jdwpset}"5006"
    mapPath[${serverjar[3]}]=${mall}
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

for((i=0;i<${line};i++));
do
	echo '启动服务'${serverjar[$i]}
    echo "debugport:"${map[${serverjar[$i]}]}
    echo "jar-path:"${mapPath[${serverjar[$i]}]}
    cd $qqsk${mapPath[${serverjar[$i]}]}
    pwd
    nohup java -jar -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=${map[${serverjar[$i]}]} ${serverjar[$i]} &
 	sleep 10
done
