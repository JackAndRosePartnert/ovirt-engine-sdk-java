//
// Copyright (c) 2012 Red Hat, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//           http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

package org.ovirt.engine.sdk.decorators;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.xml.bind.JAXBException;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.ovirt.engine.sdk.common.CollectionDecorator;
import org.ovirt.engine.sdk.entities.GlusterVolume;
import org.ovirt.engine.sdk.exceptions.ServerException;
import org.ovirt.engine.sdk.utils.CollectionUtils;
import org.ovirt.engine.sdk.utils.HttpHeaderUtils;
import org.ovirt.engine.sdk.utils.UrlHelper;
import org.ovirt.engine.sdk.web.HttpProxyBroker;
import org.ovirt.engine.sdk.web.UrlParameterType;

public class ClusterGlusterVolumes extends
        CollectionDecorator<org.ovirt.engine.sdk.entities.GlusterVolume,
                            org.ovirt.engine.sdk.entities.GlusterVolumes,
                            ClusterGlusterVolume> {

    private Cluster parent;

    public ClusterGlusterVolumes(HttpProxyBroker proxy, Cluster parent) {
        super(proxy, "glustervolumes");
        this.parent = parent;
    }

    @Override
    public List<ClusterGlusterVolume> list() throws ClientProtocolException, ServerException, IOException, JAXBException {
        String url = this.parent.getHref() + "/" + getName();
        return list(url, org.ovirt.engine.sdk.entities.GlusterVolumes.class, ClusterGlusterVolume.class);
    }

    @Override
    public ClusterGlusterVolume get(UUID id) throws ClientProtocolException, ServerException, IOException, JAXBException {
        String url = this.parent.getHref() + "/" + getName() + "/" + id.toString();
        return getProxy().get(url, org.ovirt.engine.sdk.entities.GlusterVolume.class, ClusterGlusterVolume.class);
    }

    
}
