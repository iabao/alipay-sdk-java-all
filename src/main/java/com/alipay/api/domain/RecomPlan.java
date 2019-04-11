package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐方案
 *
 * @author auto create
 * @since 1.0, 2018-11-23 15:33:43
 */
public class RecomPlan extends AlipayObject {

	private static final long serialVersionUID = 8845434198149657267L;

	/**
	 * 投保key关键字
	 */
	@ApiField("key")
	private String key;

	/**
	 * 方案名称，展示用
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用户选择后投保带的对象
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
