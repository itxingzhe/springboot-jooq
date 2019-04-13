-- ----------------------------
-- Function structure for mycat_seq_currval
-- ----------------------------
DROP FUNCTION IF EXISTS `mycat_seq_currval`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `mycat_seq_currval`(seq_name VARCHAR(50)) RETURNS varchar(64) CHARSET utf8
    DETERMINISTIC
BEGIN DECLARE retval VARCHAR(64);
        SET retval="-999999999,null";
        SELECT CONCAT(CAST(current_value AS CHAR),",",CAST(increment AS CHAR)) INTO retval
          FROM mycat_seqlg WHERE `name` = seq_name;
        RETURN retval ;
END
;;
DELIMITER ;

-- ----------------------------
-- Function structure for mycat_seq_nextval
-- ----------------------------
DROP FUNCTION IF EXISTS `mycat_seq_nextval`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `mycat_seq_nextval`(seq_name VARCHAR(50)) RETURNS varchar(64) CHARSET utf8
    DETERMINISTIC
BEGIN UPDATE mycat_seqlg
                 SET current_value = current_value + increment
                  WHERE `name` = seq_name;
         RETURN mycat_seq_currval(seq_name);
END
;;
DELIMITER ;

-- ----------------------------
-- Function structure for mycat_seq_setval
-- ----------------------------
DROP FUNCTION IF EXISTS `mycat_seq_setval`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `mycat_seq_setval`(seq_name VARCHAR(50), VALUE INTEGER) RETURNS varchar(64) CHARSET utf8
    DETERMINISTIC
BEGIN UPDATE mycat_seqlg
                   SET current_value = VALUE
                   WHERE `name` = seq_name;
         RETURN mycat_seq_currval(seq_name);
END
;;
DELIMITER ;
