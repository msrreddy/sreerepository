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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.rknowsys.eapp.hrm.model.LeavePeriod;
import com.rknowsys.eapp.hrm.model.LeavePeriodModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LeavePeriod service. Represents a row in the &quot;leave_period&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.LeavePeriodModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LeavePeriodImpl}.
 * </p>
 *
 * @author rknowsys
 * @see LeavePeriodImpl
 * @see com.rknowsys.eapp.hrm.model.LeavePeriod
 * @see com.rknowsys.eapp.hrm.model.LeavePeriodModel
 * @generated
 */
public class LeavePeriodModelImpl extends BaseModelImpl<LeavePeriod>
	implements LeavePeriodModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a leave period model instance should use the {@link com.rknowsys.eapp.hrm.model.LeavePeriod} interface instead.
	 */
	public static final String TABLE_NAME = "leave_period";
	public static final Object[][] TABLE_COLUMNS = {
			{ "leavePeriodId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "userId", Types.BIGINT },
			{ "startMonth", Types.INTEGER },
			{ "startDate", Types.INTEGER },
			{ "endDate", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table leave_period (leavePeriodId LONG not null primary key,companyId LONG,groupId LONG,createDate DATE null,modifiedDate DATE null,userId LONG,startMonth INTEGER,startDate INTEGER,endDate VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table leave_period";
	public static final String ORDER_BY_JPQL = " ORDER BY leavePeriod.leavePeriodId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY leave_period.leavePeriodId ASC";
	public static final String DATA_SOURCE = "hrmDataSource";
	public static final String SESSION_FACTORY = "hrmSessionFactory";
	public static final String TX_MANAGER = "hrmTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.LeavePeriod"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.LeavePeriod"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rknowsys.eapp.hrm.model.LeavePeriod"),
			true);
	public static long GROUPID_COLUMN_BITMASK = 1L;
	public static long LEAVEPERIODID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.LeavePeriod"));

	public LeavePeriodModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _leavePeriodId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLeavePeriodId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _leavePeriodId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return LeavePeriod.class;
	}

	@Override
	public String getModelClassName() {
		return LeavePeriod.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("leavePeriodId", getLeavePeriodId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("startMonth", getStartMonth());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long leavePeriodId = (Long)attributes.get("leavePeriodId");

		if (leavePeriodId != null) {
			setLeavePeriodId(leavePeriodId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Integer startMonth = (Integer)attributes.get("startMonth");

		if (startMonth != null) {
			setStartMonth(startMonth);
		}

		Integer startDate = (Integer)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		String endDate = (String)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}
	}

	@Override
	public long getLeavePeriodId() {
		return _leavePeriodId;
	}

	@Override
	public void setLeavePeriodId(long leavePeriodId) {
		_leavePeriodId = leavePeriodId;
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
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
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
	public int getStartMonth() {
		return _startMonth;
	}

	@Override
	public void setStartMonth(int startMonth) {
		_startMonth = startMonth;
	}

	@Override
	public int getStartDate() {
		return _startDate;
	}

	@Override
	public void setStartDate(int startDate) {
		_startDate = startDate;
	}

	@Override
	public String getEndDate() {
		if (_endDate == null) {
			return StringPool.BLANK;
		}
		else {
			return _endDate;
		}
	}

	@Override
	public void setEndDate(String endDate) {
		_endDate = endDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			LeavePeriod.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public LeavePeriod toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LeavePeriod)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LeavePeriodImpl leavePeriodImpl = new LeavePeriodImpl();

		leavePeriodImpl.setLeavePeriodId(getLeavePeriodId());
		leavePeriodImpl.setCompanyId(getCompanyId());
		leavePeriodImpl.setGroupId(getGroupId());
		leavePeriodImpl.setCreateDate(getCreateDate());
		leavePeriodImpl.setModifiedDate(getModifiedDate());
		leavePeriodImpl.setUserId(getUserId());
		leavePeriodImpl.setStartMonth(getStartMonth());
		leavePeriodImpl.setStartDate(getStartDate());
		leavePeriodImpl.setEndDate(getEndDate());

		leavePeriodImpl.resetOriginalValues();

		return leavePeriodImpl;
	}

	@Override
	public int compareTo(LeavePeriod leavePeriod) {
		long primaryKey = leavePeriod.getPrimaryKey();

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

		if (!(obj instanceof LeavePeriod)) {
			return false;
		}

		LeavePeriod leavePeriod = (LeavePeriod)obj;

		long primaryKey = leavePeriod.getPrimaryKey();

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
		LeavePeriodModelImpl leavePeriodModelImpl = this;

		leavePeriodModelImpl._originalGroupId = leavePeriodModelImpl._groupId;

		leavePeriodModelImpl._setOriginalGroupId = false;

		leavePeriodModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<LeavePeriod> toCacheModel() {
		LeavePeriodCacheModel leavePeriodCacheModel = new LeavePeriodCacheModel();

		leavePeriodCacheModel.leavePeriodId = getLeavePeriodId();

		leavePeriodCacheModel.companyId = getCompanyId();

		leavePeriodCacheModel.groupId = getGroupId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			leavePeriodCacheModel.createDate = createDate.getTime();
		}
		else {
			leavePeriodCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			leavePeriodCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			leavePeriodCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		leavePeriodCacheModel.userId = getUserId();

		leavePeriodCacheModel.startMonth = getStartMonth();

		leavePeriodCacheModel.startDate = getStartDate();

		leavePeriodCacheModel.endDate = getEndDate();

		String endDate = leavePeriodCacheModel.endDate;

		if ((endDate != null) && (endDate.length() == 0)) {
			leavePeriodCacheModel.endDate = null;
		}

		return leavePeriodCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{leavePeriodId=");
		sb.append(getLeavePeriodId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", startMonth=");
		sb.append(getStartMonth());
		sb.append(", startDate=");
		sb.append(getStartDate());
		sb.append(", endDate=");
		sb.append(getEndDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.LeavePeriod");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>leavePeriodId</column-name><column-value><![CDATA[");
		sb.append(getLeavePeriodId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startMonth</column-name><column-value><![CDATA[");
		sb.append(getStartMonth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startDate</column-name><column-value><![CDATA[");
		sb.append(getStartDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endDate</column-name><column-value><![CDATA[");
		sb.append(getEndDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = LeavePeriod.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			LeavePeriod.class
		};
	private long _leavePeriodId;
	private long _companyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
	private String _userUuid;
	private int _startMonth;
	private int _startDate;
	private String _endDate;
	private long _columnBitmask;
	private LeavePeriod _escapedModel;
}