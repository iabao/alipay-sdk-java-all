package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FaceAbilityExtInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.faceability.identify response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-26 16:25:00
 */
public class ZolozAuthenticationCustomerFaceabilityIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5796735988939468872L;

	/** 
	 * 能力接口返回值
	 */
	@ApiField("biz_info")
	private FaceAbilityExtInfo bizInfo;

	public void setBizInfo(FaceAbilityExtInfo bizInfo) {
		this.bizInfo = bizInfo;
	}
	public FaceAbilityExtInfo getBizInfo( ) {
		return this.bizInfo;
	}

}
