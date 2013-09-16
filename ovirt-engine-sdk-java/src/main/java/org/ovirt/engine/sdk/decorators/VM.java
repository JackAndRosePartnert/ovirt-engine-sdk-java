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

// *********************************************************************
// ********************* GENERATED CODE - DO NOT MODIFY ****************
// *********************************************************************

package org.ovirt.engine.sdk.decorators;

import java.io.IOException;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.ovirt.engine.sdk.entities.Action;
import org.ovirt.engine.sdk.entities.Response;
import org.ovirt.engine.sdk.exceptions.ServerException;
import org.ovirt.engine.sdk.utils.HttpHeaderBuilder;
import org.ovirt.engine.sdk.utils.HttpHeaderUtils;
import org.ovirt.engine.sdk.utils.UrlBuilder;
import org.ovirt.engine.sdk.web.HttpProxyBroker;
import org.ovirt.engine.sdk.web.UrlParameterType;

/**
 * <p>VM providing relation and functional services
 * <p>to {@link org.ovirt.engine.sdk.entities.VM }.
 */
@SuppressWarnings("unused")
public class VM extends
        org.ovirt.engine.sdk.entities.VM {

    private HttpProxyBroker proxy;
    private final Object LOCK = new Object();

    private volatile VMPermissions vMPermissions;
    private volatile VMReportedDevices vMReportedDevices;
    private volatile VMTags vMTags;
    private volatile VMSnapshots vMSnapshots;
    private volatile VMStatistics vMStatistics;
    private volatile VMApplications vMApplications;
    private volatile VMWatchDogs vMWatchDogs;
    private volatile VMDisks vMDisks;
    private volatile VMNICs vMNICs;
    private volatile VMCdRoms vMCdRoms;


    /**
     * @param proxy HttpProxyBroker
     */
    public VM(HttpProxyBroker proxy) {
        this.proxy = proxy;
    }

    /**
     * @return HttpProxyBroker
     */
    private HttpProxyBroker getProxy() {
        return proxy;
    }

    /**
     * Gets the value of the VMPermissions property.
     *
     * @return
     *     {@link VMPermissions }
     */
    public VMPermissions getPermissions() {
        if (this.vMPermissions == null) {
            synchronized (this.LOCK) {
                if (this.vMPermissions == null) {
                    this.vMPermissions = new VMPermissions(proxy, this);
                }
            }
        }
        return vMPermissions;
    }
    /**
     * Gets the value of the VMReportedDevices property.
     *
     * @return
     *     {@link VMReportedDevices }
     */
    public VMReportedDevices getReportedDevices() {
        if (this.vMReportedDevices == null) {
            synchronized (this.LOCK) {
                if (this.vMReportedDevices == null) {
                    this.vMReportedDevices = new VMReportedDevices(proxy, this);
                }
            }
        }
        return vMReportedDevices;
    }
    /**
     * Gets the value of the VMTags property.
     *
     * @return
     *     {@link VMTags }
     */
    public VMTags getTags() {
        if (this.vMTags == null) {
            synchronized (this.LOCK) {
                if (this.vMTags == null) {
                    this.vMTags = new VMTags(proxy, this);
                }
            }
        }
        return vMTags;
    }
    /**
     * Gets the value of the VMSnapshots property.
     *
     * @return
     *     {@link VMSnapshots }
     */
    public VMSnapshots getSnapshots() {
        if (this.vMSnapshots == null) {
            synchronized (this.LOCK) {
                if (this.vMSnapshots == null) {
                    this.vMSnapshots = new VMSnapshots(proxy, this);
                }
            }
        }
        return vMSnapshots;
    }
    /**
     * Gets the value of the VMStatistics property.
     *
     * @return
     *     {@link VMStatistics }
     */
    public VMStatistics getStatistics() {
        if (this.vMStatistics == null) {
            synchronized (this.LOCK) {
                if (this.vMStatistics == null) {
                    this.vMStatistics = new VMStatistics(proxy, this);
                }
            }
        }
        return vMStatistics;
    }
    /**
     * Gets the value of the VMApplications property.
     *
     * @return
     *     {@link VMApplications }
     */
    public VMApplications getApplications() {
        if (this.vMApplications == null) {
            synchronized (this.LOCK) {
                if (this.vMApplications == null) {
                    this.vMApplications = new VMApplications(proxy, this);
                }
            }
        }
        return vMApplications;
    }
    /**
     * Gets the value of the VMWatchDogs property.
     *
     * @return
     *     {@link VMWatchDogs }
     */
    public VMWatchDogs getWatchDogs() {
        if (this.vMWatchDogs == null) {
            synchronized (this.LOCK) {
                if (this.vMWatchDogs == null) {
                    this.vMWatchDogs = new VMWatchDogs(proxy, this);
                }
            }
        }
        return vMWatchDogs;
    }
    /**
     * Gets the value of the VMDisks property.
     *
     * @return
     *     {@link VMDisks }
     */
    public VMDisks getDisks() {
        if (this.vMDisks == null) {
            synchronized (this.LOCK) {
                if (this.vMDisks == null) {
                    this.vMDisks = new VMDisks(proxy, this);
                }
            }
        }
        return vMDisks;
    }
    /**
     * Gets the value of the VMNICs property.
     *
     * @return
     *     {@link VMNICs }
     */
    public VMNICs getNics() {
        if (this.vMNICs == null) {
            synchronized (this.LOCK) {
                if (this.vMNICs == null) {
                    this.vMNICs = new VMNICs(proxy, this);
                }
            }
        }
        return vMNICs;
    }
    /**
     * Gets the value of the VMCdRoms property.
     *
     * @return
     *     {@link VMCdRoms }
     */
    public VMCdRoms getCdRoms() {
        if (this.vMCdRoms == null) {
            synchronized (this.LOCK) {
                if (this.vMCdRoms == null) {
                    this.vMCdRoms = new VMCdRoms(proxy, this);
                }
            }
        }
        return vMCdRoms;
    }


    /**
     * Performs suspend action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action suspend(Action action) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/suspend";

        List<Header> headers = new HttpHeaderBuilder()
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs suspend action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     *
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action suspend(Action action, String correlationId) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/suspend";

        List<Header> headers = new HttpHeaderBuilder()
                .add("Correlation-Id", correlationId)
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Updates VM object.
     *
     * @param vm {@link org.ovirt.engine.sdk.entities.VM}
     *    <pre>
     *    [vm.name]
     *    [vm.cluster.id|name]
     *    [vm.timezone]
     *    [vm.os.boot]
     *    [vm.custom_properties.custom_property]
     *    [vm.os.type]
     *    [vm.usb.enabled]
     *    [vm.usb.type]
     *    [vm.type]
     *    [vm.os.initRd]
     *    [vm.display.monitors]
     *    [vm.display.single_qxl_pci]
     *    [vm.display.type]
     *    [vm.display.allow_override]
     *    [vm.display.smartcard_enabled]
     *    [vm.display.keyboard_layout]
     *    [vm.os.cmdline]
     *    [vm.cpu.mode]
     *    [vm.cpu.topology.cores]
     *    [vm.cpu_shares]
     *    [vm.memory]
     *    [vm.high_availability.priority]
     *    [vm.high_availability.enabled]
     *    [vm.domain.name]
     *    [vm.description]
     *    [vm.comment]
     *    [vm.stateless]
     *    [vm.delete_protected]
     *    [vm.console.enabled]
     *    [vm.cpu.topology.sockets]
     *    [vm.placement_policy.affinity]
     *    [vm.placement_policy.host.id|name]
     *    [vm.origin]
     *    [vm.os.kernel]
     *    [vm.tunnel_migration]
     *    [vm.payloads.payload]
     *    [vm.cpu.cpu_tune.vcpu_pin]
     *    </pre>
     *
     * @return
     *     {@link VM }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public VM update() throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref();

        List<Header> headers = new HttpHeaderBuilder()
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().update(
                url,
                this,
                org.ovirt.engine.sdk.entities.VM.class,
                VM.class,
                headers);
    }
    /**
     * Updates VM object.
     *
     * @param vm {@link org.ovirt.engine.sdk.entities.VM}
     *    <pre>
     *    [vm.name]
     *    [vm.cluster.id|name]
     *    [vm.timezone]
     *    [vm.os.boot]
     *    [vm.custom_properties.custom_property]
     *    [vm.os.type]
     *    [vm.usb.enabled]
     *    [vm.usb.type]
     *    [vm.type]
     *    [vm.os.initRd]
     *    [vm.display.monitors]
     *    [vm.display.single_qxl_pci]
     *    [vm.display.type]
     *    [vm.display.allow_override]
     *    [vm.display.smartcard_enabled]
     *    [vm.display.keyboard_layout]
     *    [vm.os.cmdline]
     *    [vm.cpu.mode]
     *    [vm.cpu.topology.cores]
     *    [vm.cpu_shares]
     *    [vm.memory]
     *    [vm.high_availability.priority]
     *    [vm.high_availability.enabled]
     *    [vm.domain.name]
     *    [vm.description]
     *    [vm.comment]
     *    [vm.stateless]
     *    [vm.delete_protected]
     *    [vm.console.enabled]
     *    [vm.cpu.topology.sockets]
     *    [vm.placement_policy.affinity]
     *    [vm.placement_policy.host.id|name]
     *    [vm.origin]
     *    [vm.os.kernel]
     *    [vm.tunnel_migration]
     *    [vm.payloads.payload]
     *    [vm.cpu.cpu_tune.vcpu_pin]
     *    </pre>
     *
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     *
     * @return
     *     {@link VM }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public VM update(String correlationId) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref();

        List<Header> headers = new HttpHeaderBuilder()
                .add("Correlation-Id", correlationId)
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().update(
                url,
                this,
                org.ovirt.engine.sdk.entities.VM.class,
                VM.class,
                headers);
    }
    /**
     * Performs stop action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action stop(Action action) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/stop";

        List<Header> headers = new HttpHeaderBuilder()
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs stop action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     *
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action stop(Action action, String correlationId) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/stop";

        List<Header> headers = new HttpHeaderBuilder()
                .add("Correlation-Id", correlationId)
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs cancelmigration action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action cancelmigration(Action action) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/cancelmigration";

        List<Header> headers = new HttpHeaderBuilder()
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs exportVm action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     *    <pre>
     *    [action.async]
     *    [action.exclusive]
     *    [action.discard_snapshots]
     *    [action.storage_domain.id|name]
     *    [action.grace_period.expiry]
     *    </pre>
     *
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action exportVm(Action action) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/export";

        List<Header> headers = new HttpHeaderBuilder()
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs exportVm action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     *    <pre>
     *    [action.async]
     *    [action.exclusive]
     *    [action.discard_snapshots]
     *    [action.storage_domain.id|name]
     *    [action.grace_period.expiry]
     *    </pre>
     *
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     *
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action exportVm(Action action, String correlationId) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/export";

        List<Header> headers = new HttpHeaderBuilder()
                .add("Correlation-Id", correlationId)
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs detach action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action detach(Action action) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/detach";

        List<Header> headers = new HttpHeaderBuilder()
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs detach action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     *
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action detach(Action action, String correlationId) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/detach";

        List<Header> headers = new HttpHeaderBuilder()
                .add("Correlation-Id", correlationId)
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs ticket action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     *    <pre>
     *    [action.ticket.value]
     *    </pre>
     *
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action ticket(Action action) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/ticket";

        List<Header> headers = new HttpHeaderBuilder()
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs ticket action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     *    <pre>
     *    [action.ticket.value]
     *    </pre>
     *
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     *
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action ticket(Action action, String correlationId) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/ticket";

        List<Header> headers = new HttpHeaderBuilder()
                .add("Correlation-Id", correlationId)
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs start action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     *    <pre>
     *    [action.vm.os.initRd]
     *    [action.vm.domain.name]
     *    [action.vm.placement_policy.host.id|name]
     *    [action.vm.placement_policy.affinity]
     *    [action.async]
     *    [action.vm.os.kernel]
     *    [action.grace_period.expiry]
     *    [action.vm.display.type]
     *    [action.vm.stateless]
     *    [action.vm.os.cmdline]
     *    [action.vm.domain.user.username]
     *    [action.pause]
     *    [action.vm.os.boot]
     *    [action.vm.domain.user.password]
     *    </pre>
     *
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action start(Action action) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/start";

        List<Header> headers = new HttpHeaderBuilder()
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs start action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     *    <pre>
     *    [action.vm.os.initRd]
     *    [action.vm.domain.name]
     *    [action.vm.placement_policy.host.id|name]
     *    [action.vm.placement_policy.affinity]
     *    [action.async]
     *    [action.vm.os.kernel]
     *    [action.grace_period.expiry]
     *    [action.vm.display.type]
     *    [action.vm.stateless]
     *    [action.vm.os.cmdline]
     *    [action.vm.domain.user.username]
     *    [action.pause]
     *    [action.vm.os.boot]
     *    [action.vm.domain.user.password]
     *    </pre>
     *
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     *
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action start(Action action, String correlationId) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/start";

        List<Header> headers = new HttpHeaderBuilder()
                .add("Correlation-Id", correlationId)
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs migrate action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     *    <pre>
     *    [action.host.id|name]
     *    [action.async]
     *    [action.force]
     *    [action.grace_period.expiry]
     *    </pre>
     *
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action migrate(Action action) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/migrate";

        List<Header> headers = new HttpHeaderBuilder()
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs migrate action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     *    <pre>
     *    [action.host.id|name]
     *    [action.async]
     *    [action.force]
     *    [action.grace_period.expiry]
     *    </pre>
     *
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     *
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action migrate(Action action, String correlationId) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/migrate";

        List<Header> headers = new HttpHeaderBuilder()
                .add("Correlation-Id", correlationId)
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Deletes object.
     *
     * @return
     *     {@link Response }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Response delete() throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref();

        List<Header> headers = new HttpHeaderBuilder()
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().delete(url, Response.class, headers);
    }
    /**
     * Deletes object.
     *
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     * @param async
     *    <pre>
     *    [true|false]
     *    </pre>
     *
     * @return
     *     {@link Response }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Response delete(Boolean async, String correlationId) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref();

        List<Header> headers = new HttpHeaderBuilder()
                .add("Correlation-Id", correlationId)
                .build();

        url = new UrlBuilder(url)
                .add("async", async, UrlParameterType.MATRIX)
                .build();

        return getProxy().delete(url, Response.class, headers);
    }
    /**
     * Deletes object.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     *    <pre>
     *    [action.force]
     *    [action.vm.disks.detach_only]
     *    </pre>
     *
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     * @param async
     *    <pre>
     *    [true|false]
     *    </pre>
     *
     * @return
     *     {@link Response }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Response delete(org.ovirt.engine.sdk.entities.Action action, Boolean async, String correlationId) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref();

        List<Header> headers = new HttpHeaderBuilder()
                .add("Correlation-Id", correlationId)
                .build();

        url = new UrlBuilder(url)
                .add("async", async, UrlParameterType.MATRIX)
                .build();

        return getProxy().delete(url, action,
                org.ovirt.engine.sdk.entities.Action.class, Response.class, headers);
    }
    /**
     * Performs move action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     *    <pre>
     *    action.storage_domain.id|name
     *    [action.async]
     *    [action.grace_period.expiry]
     *    </pre>
     *
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action move(Action action) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/move";

        List<Header> headers = new HttpHeaderBuilder()
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs move action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     *    <pre>
     *    action.storage_domain.id|name
     *    [action.async]
     *    [action.grace_period.expiry]
     *    </pre>
     *
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     *
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action move(Action action, String correlationId) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/move";

        List<Header> headers = new HttpHeaderBuilder()
                .add("Correlation-Id", correlationId)
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs shutdown action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action shutdown(Action action) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/shutdown";

        List<Header> headers = new HttpHeaderBuilder()
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs shutdown action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     *
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action shutdown(Action action, String correlationId) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/shutdown";

        List<Header> headers = new HttpHeaderBuilder()
                .add("Correlation-Id", correlationId)
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }

}

