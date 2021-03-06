/*
Copyright 2011-2016 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.debug.models.remotebrowser;

import com.google.common.base.Preconditions;

/**
 * Contains information about a remote file.
 */
public final class RemoteFile {
  /**
   * Name of the file.
   */
  private final String name;

  /**
   * Creates a new remote file object.
   *
   * @param name Name of the file.
   */
  public RemoteFile(final String name) {
    this.name = Preconditions.checkNotNull(name, "IE00770: Name argument can not be null");
  }

  /**
   * Returns the name of the file.
   *
   * @return The name of the file.
   */
  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return getName();
  }
}
