/*
 * Copyright 2017 IBM Corp. All Rights Reserved.
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
package com.ibm.watson.developer_cloud.natural_language_understanding.v1.model;

import com.google.gson.annotations.SerializedName;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.NaturalLanguageUnderstanding;
import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * The general concepts referenced or alluded to in the specified content.
 */
public class ConceptsResult extends GenericModel {

  /** Name of the concept. */
  private String name;
  /** Relevance score between 0 and 1. Higher scores indicate greater relevance. */
  private Long relevance;
  @SerializedName("dbpedia_resource")
  private String dbpediaResource;

  /**
   * Instantiates a new `ConceptsResult`
   *
   * @param name Name of the concept.
   * @param relevance Relevance score between 0 and 1. Higher scores indicate greater relevance.
   * @param dbpediaResource 
   */
  public ConceptsResult(final String name, final Long relevance, final String dbpediaResource) {
    this.name = name;
    this.relevance = relevance;
    this.dbpediaResource = dbpediaResource;
  }

  /**
   * Gets the name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the relevance.
   *
   * @return the relevance
   */
  public Long getRelevance() {
    return relevance;
  }

  /**
   * Gets the dbpediaResource.
   *
   * @return the dbpediaResource
   */
  public String getDbpediaResource() {
    return dbpediaResource;
  }

  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * Sets the relevance.
   *
   * @param relevance the new relevance
   */
  public void setRelevance(final Long relevance) {
    this.relevance = relevance;
  }

  /**
   * Sets the dbpediaResource.
   *
   * @param dbpediaResource the new dbpediaResource
   */
  public void setDbpediaResource(final String dbpediaResource) {
    this.dbpediaResource = dbpediaResource;
  }

}
