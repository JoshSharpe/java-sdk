/*
 * Copyright 2015 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.conversation.v1.model.workspace;

import java.util.List;

import com.ibm.watson.developer_cloud.conversation.v1.ConversationService;
import com.ibm.watson.developer_cloud.conversation.v1.model.Pagination;
import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * The response payload from the Conversation service's workspace list API call
 * {@link ConversationService#listWorkspaces()}.
 *
 * @see <a href="http://www.ibm.com/watson/developercloud/conversation.html">
 *      http://www.ibm.com/ watson/developercloud/conversation.html</a>
 */
public class WorkspaceListResponse extends GenericModel {

  private List<WorkspaceResponse> workspaces;
  private Pagination pagination;

  /**
   * Returns a list of workspaces.
   *
   * @return an array of {@link Workspace}.
   */
  public List<WorkspaceResponse> getworkspaces() {
    return workspaces;
  }

  /**
   * Returns this pagination options for a given list of workspaces.
   *
   * @return a {@link Pagination} object for the list.
   */
  public Pagination getPagination() {
    return pagination;
  }

}
