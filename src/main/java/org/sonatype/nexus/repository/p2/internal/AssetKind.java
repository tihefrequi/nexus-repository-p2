/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2017-present Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.repository.p2.internal;

import javax.annotation.Nonnull;

import org.sonatype.nexus.repository.cache.CacheControllerHolder;
import org.sonatype.nexus.repository.cache.CacheControllerHolder.CacheType;

/**
 * Asset kinds for P2.
 *
 * Examples of all can be found at: http://download.eclipse.org/technology/m2e/releases/1.7/1.7.0.20160603-1933/?d
 */
public enum AssetKind
{
  P2_INDEX(CacheControllerHolder.METADATA),
  ARTIFACT_JAR(CacheControllerHolder.METADATA),
  ARTIFACT_XML(CacheControllerHolder.METADATA),
  ARTIFACT_XML_XZ(CacheControllerHolder.METADATA),
  CONTENT_JAR(CacheControllerHolder.METADATA),
  CONTENT_XML(CacheControllerHolder.METADATA),
  CONTENT_XML_XZ(CacheControllerHolder.METADATA),
  COMPOSITE_ARTIFACTS_JAR(CacheControllerHolder.METADATA),
  COMPOSITE_CONTENT_JAR(CacheControllerHolder.METADATA),
  COMPOSITE_ARTIFACTS_XML(CacheControllerHolder.METADATA),
  COMPOSITE_CONTENT_XML(CacheControllerHolder.METADATA),
  COMPONENT_BINARY(CacheControllerHolder.CONTENT),
  COMPONENT_PLUGINS(CacheControllerHolder.CONTENT),
  COMPONENT_FEATURES(CacheControllerHolder.CONTENT);

  private final CacheType cacheType;

  AssetKind(final CacheType cacheType) {
    this.cacheType = cacheType;
  }

  @Nonnull
  public CacheType getCacheType() {
    return cacheType;
  }
}
