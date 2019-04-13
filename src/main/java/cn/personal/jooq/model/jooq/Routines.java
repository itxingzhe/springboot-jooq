/*
 * This file is generated by jOOQ.
 */
package cn.personal.jooq.model.jooq;


import cn.personal.jooq.model.jooq.routines.MycatSeqNextval;
import cn.personal.jooq.model.jooq.routines.MycatSeqSetval;
import javax.annotation.Generated;
import org.jooq.Configuration;
import org.jooq.Field;


/**
 * Convenience access to all stored procedures and functions in mydata
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Routines {

  /**
   * Call <code>mydata.mycat_seq_nextval</code>
   */
  public static String mycatSeqNextval(Configuration configuration, String seqName) {
    MycatSeqNextval f = new MycatSeqNextval();
    f.setSeqName(seqName);

    f.execute(configuration);
    return f.getReturnValue();
  }

  /**
   * Get <code>mydata.mycat_seq_nextval</code> as a field.
   */
  public static Field<String> mycatSeqNextval(String seqName) {
    MycatSeqNextval f = new MycatSeqNextval();
    f.setSeqName(seqName);

    return f.asField();
  }

  /**
   * Get <code>mydata.mycat_seq_nextval</code> as a field.
   */
  public static Field<String> mycatSeqNextval(Field<String> seqName) {
    MycatSeqNextval f = new MycatSeqNextval();
    f.setSeqName(seqName);

    return f.asField();
  }

  /**
   * Call <code>mydata.mycat_seq_setval</code>
   */
  public static String mycatSeqSetval(Configuration configuration, String seqName, Integer value) {
    MycatSeqSetval f = new MycatSeqSetval();
    f.setSeqName(seqName);
    f.setValue(value);

    f.execute(configuration);
    return f.getReturnValue();
  }

  /**
   * Get <code>mydata.mycat_seq_setval</code> as a field.
   */
  public static Field<String> mycatSeqSetval(String seqName, Integer value) {
    MycatSeqSetval f = new MycatSeqSetval();
    f.setSeqName(seqName);
    f.setValue(value);

    return f.asField();
  }

  /**
   * Get <code>mydata.mycat_seq_setval</code> as a field.
   */
  public static Field<String> mycatSeqSetval(Field<String> seqName, Field<Integer> value) {
    MycatSeqSetval f = new MycatSeqSetval();
    f.setSeqName(seqName);
    f.setValue(value);

    return f.asField();
  }
}
