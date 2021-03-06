package com.ibm.watson.developer_cloud.conversation.v1.model.workspace.entity;

import java.util.Date;

public class ValueExportResponse extends Value {
  protected Date created;
  protected Date updated;
  
  /**
   * Returns the time stamp for when the example was created.
   *
   * @return a time stamp of example creation
   */
  public Date getCreated() {
    return created;
  }

  /**
   * Returns the time stamp for when the example was last updated.
   *
   * @return a time stamp of example's last update
   */
  public Date getUpdated() {
    return updated;
  }
}
