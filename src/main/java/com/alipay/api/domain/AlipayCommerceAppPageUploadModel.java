package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租户应用数据同步页面接口
 *
 * @author auto create
 * @since 1.0, 2019-01-17 18:21:22
 */
public class AlipayCommerceAppPageUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1718595883111614292L;

	/**
	 * 租户应用服务数据
	 */
	@ApiField("content")
	private CommerceAppUploadRequestContent content;

	/**
	 * 租户应用服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	public CommerceAppUploadRequestContent getContent() {
		return this.content;
	}
	public void setContent(CommerceAppUploadRequestContent content) {
		this.content = content;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}