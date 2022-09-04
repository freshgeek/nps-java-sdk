package com.nps.sdk.java.request.client;


import cn.hutool.http.Method;
import com.nps.sdk.java.request.base.BaseForm;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
@Setter
@Getter
@ToString
public class ClientAddForm extends BaseForm {
	/**
	 * 备注
	 */
	String remark;
	/**
	 * basic权限认证用户名
	 */
	String u;

	/**
	 * basic权限认证密码
	 */
	String p;
	/**
	 * 条数(分页显示的条数)
	 */
	long limit;
	/**
	 * 客户端验证密钥
	 */
	String vkey;
	/**
	 * 是否允许客户端以配置文件模式连接 1允许 0不允许
	 */
	Integer config_conn_allow;
	/**
	 * 压缩1允许 0不允许
	 */
	Integer compress;
	/**
	 * 是否加密（1或者0）1允许 0不允许
	 */
	Integer crypt;
	/**
	 * 带宽限制 单位KB/S 空则为不限制
	 */
	Long rate_limit;
	/**
	 * 流量限制 单位M 空则为不限制
	 */
	Long flow_limit;
	/**
	 * 客户端最大连接数量 空则为不限制
	 */
	Long max_conn;
	/**
	 * 客户端最大隧道数量 空则为不限制
	 */
	Long max_tunnel;


	public ClientAddForm(String url, Method method, String remark, String u, String p, long limit, String vkey, Integer config_conn_allow, Integer compress, Integer crypt, Long rate_limit, Long flow_limit, Long max_conn, Long max_tunnel) {
		super(url, method);
		this.remark = remark;
		this.u = u;
		this.p = p;
		this.limit = limit;
		this.vkey = vkey;
		this.config_conn_allow = config_conn_allow;
		this.compress = compress;
		this.crypt = crypt;
		this.rate_limit = rate_limit;
		this.flow_limit = flow_limit;
		this.max_conn = max_conn;
		this.max_tunnel = max_tunnel;
	}

	public ClientAddForm() {
		super("/client/add/", Method.POST);
	}

}
