/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rknowsys.eapp.hrm.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.rknowsys.eapp.hrm.model.Dependent;
import com.rknowsys.eapp.hrm.model.DependentModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Dependent service. Represents a row in the &quot;hrm_Dependent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.DependentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DependentImpl}.
 * </p>
 *
 * @author rknowsys
 * @see DependentImpl
 * @see com.rknowsys.eapp.hrm.model.Dependent
 * @see com.rknowsys.eapp.hrm.model.DependentModel
 * @generated
 */
public class DependentModelImpl extends BaseModelImpl<Dependent>
	implements DependentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dependent model instance should use the {@link com.rknowsys.eapp.hrm.model.Dependent} interface instead.
	 */
	public static final String TABLE_NAME = "hrm_Dependent";
	public static final Object[][] TABLE_COLUMNS = {
			{ "dependentId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table hrm_Dependent (dependentId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,createDate DATE null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table hrm_Dependent";
	public static final String ORDER_BY_JPQL = " ORDER BY dependent.dependentId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY hrm_Dependent.dependentId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.Dependent"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.Dependent"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.Dependent"));

	public DependentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _dependentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDependentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dependentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Dependent.class;
	}

	@Override
	public String getModelClassName() {
		return Dependent.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dependentId", getDependentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dependentId = (Long)attributes.get("dependentId");

		if (dependentId != null) {
			setDependentId(dependentId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public long getDependentId() {
		return _dependentId;
	}

	@Override
	public void setDependentId(long dependentId) {
		_dependentId = dependentId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Dependent.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Dependent toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Dependent)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DependentImpl dependentImpl = new DependentImpl();

		dependentImpl.setDependentId(getDependentId());
		dependentImpl.setGroupId(getGroupId());
		dependentImpl.setCompanyId(getCompanyId());
		dependentImpl.setUserId(getUserId());
		dependentImpl.setCreateDate(getCreateDate());
		dependentImpl.setModifiedDate(getModifiedDate());

		dependentImpl.resetOriginalValues();

		return dependentImpl;
	}

	@Override
	public int compareTo(Dependent dependent) {
		long primaryKey = dependent.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Dependent)) {
			return false;
		}

		Dependent dependent = (Dependent)obj;

		long primaryKey = dependent.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Dependent> toCacheModel() {
		DependentCacheModel dependentCacheModel = new DependentCacheModel();

		dependentCacheModel.dependentId = getDependentId();

		dependentCacheModel.groupId = getGroupId();

		dependentCacheModel.companyId = getCompanyId();

		dependentCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			dependentCacheModel.createDate = createDate.getTime();
		}
		else {
			dependentCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dependentCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dependentCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return dependentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{dependentId=");
		sb.append(getDependentId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.Dependent");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dependentId</column-name><column-value><![CDATA[");
		sb.append(getDependentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Dependent.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Dependent.class
		};
	private long _dependentId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private Dependent _escapedModel;
}