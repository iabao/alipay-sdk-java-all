package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CloudBusOdItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.od.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-07 17:25:01
 */
public class AlipayDataAiserviceCloudbusOdGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5273585511362666196L;

	/** 
	 * od结果
	 */
	@ApiListField("result")
	@ApiField("cloud_bus_od_item")
	private List<CloudBusOdItem> result;

	public void setResult(List<CloudBusOdItem> result) {
		this.result = result;
	}
	public List<CloudBusOdItem> getResult( ) {
		return this.result;
	}

}