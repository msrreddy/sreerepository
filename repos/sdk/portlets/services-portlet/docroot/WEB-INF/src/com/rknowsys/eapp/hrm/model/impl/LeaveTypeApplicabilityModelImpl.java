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

import com.rknowsys.eapp.hrm.model.LeaveTypeApplicability;
import com.rknowsys.eapp.hrm.model.LeaveTypeApplicabilityModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LeaveTypeApplicability service. Represents a row in the &quot;leave_type_applicability&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.LeaveTypeApplicabilityModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LeaveTypeApplicabilityImpl}.
 * </p>
 *
 * @author rknowsys
 * @see LeaveTypeApplicabilityImpl
 * @see com.rknowsys.eapp.hrm.model.LeaveTypeApplicability
 * @see com.rknowsys.eapp.hrm.model.LeaveTypeApplicabilityModel
 * @generated
 */
public class LeaveTypeApplicabilityModelImpl extends BaseModelImpl<LeaveTypeApplicability>
	implements LeaveTypeApplicabilityModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a leave type applicability model instance should use the {@link com.rknowsys.eapp.hrm.model.LeaveTypeApplicability} interface instead.
	 */
	public static final String TABLE_NAME = "leave_type_applicability";
	public static final Object[][] TABLE_COLUMNS = {
			{ "leaveTypeApplicabilityId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "userId", Types.BIGINT },
			{ "leaveTypeId", Types.BIGINT },
			{ "ifYearsOfServiceCriterionApplicable", Types.BOOLEAN },
			{ "minYearsOfService", Types.VARCHAR },
			{ "maxYearsOfService", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table leave_type_applicability (leaveTypeApplicabilityId LONG not null primary key,companyId LONG,groupId LONG,createDate DATE null,modifiedDate DATE null,userId LONG,leaveTypeId LONG,ifYearsOfServiceCriterionApplicable BOOLEAN,minYearsOfService VARCHAR(75) null,maxYearsOfService VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table leave_type_applicability";
	public static final String ORDER_BY_JPQL = " ORDER BY leaveTypeApplicability.leaveTypeApplicabilityId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY leave_type_applicability.leaveTypeApplicabilityId ASC";
	public static final String DATA_SOURCE = "hrmDataSource";
	public static final String SESSION_FACTORY = "hrmSessionFactory";
	public static final String TX_MANAGER = "hrmTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.LeaveTypeApplicability"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.LeaveTypeApplicability"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rknowsys.eapp.hrm.model.LeaveTypeApplicability"),
			true);
	public static long GROUPID_COLUMN_BITMASK = 1L;
	public static long LEAVETYPEID_COLUMN_BITMASK = 2L;
	public static long LEAVETYPEAPPLICABILITYID_COLUMN_BITMASK = 4L;
	public static final String MAPPING_TABLE_HRM_APPLICABLE_JOB_TITLES_NAME = "hrm_applicable_job_titles";
	public static final Object[][] MAPPING_TABLE_HRM_APPLICABLE_JOB_TITLES_COLUMNS =
		{
			{ "leaveTypeApplicabilityId", Types.BIGINT },
			{ "jobTitleId", Types.BIGINT }
		};
	public static final String MAPPING_TABLE_HRM_APPLICABLE_JOB_TITLES_SQL_CREATE =
		"create table hrm_applicable_job_titles (jobTitleId LONG not null,leaveTypeApplicabilityId LONG not null,primary key (jobTitleId, leaveTypeApplicabilityId))";
	public static final boolean FINDER_CACHE_ENABLED_HRM_APPLICABLE_JOB_TITLES = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.hrm_applicable_job_titles"),
			true);
	public static final String MAPPING_TABLE_HRM_APPLICABLE_EMPLOYMENT_STATUSES_NAME =
		"hrm_applicable_employment_statuses";
	public static final Object[][] MAPPING_TABLE_HRM_APPLICABLE_EMPLOYMENT_STATUSES_COLUMNS =
		{
			{ "leaveTypeApplicabilityId", Types.BIGINT },
			{ "employmentStatusId", Types.BIGINT }
		};
	public static final String MAPPING_TABLE_HRM_APPLICABLE_EMPLOYMENT_STATUSES_SQL_CREATE =
		"create table hrm_applicable_employment_statuses (employmentStatusId LONG not null,leaveTypeApplicabilityId LONG not null,primary key (employmentStatusId, leaveTypeApplicabilityId))";
	public static final boolean FINDER_CACHE_ENABLED_HRM_APPLICABLE_EMPLOYMENT_STATUSES =
		GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.hrm_applicable_employment_statuses"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.LeaveTypeApplicability"));

	public LeaveTypeApplicabilityModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _leaveTypeApplicabilityId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLeaveTypeApplicabilityId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _leaveTypeApplicabilityId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return LeaveTypeApplicability.class;
	}

	@Override
	public String getModelClassName() {
		return LeaveTypeApplicability.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("leaveTypeApplicabilityId", getLeaveTypeApplicabilityId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("leaveTypeId", getLeaveTypeId());
		attributes.put("ifYearsOfServiceCriterionApplicable",
			getIfYearsOfServiceCriterionApplicable());
		attributes.put("minYearsOfService", getMinYearsOfService());
		attributes.put("maxYearsOfService", getMaxYearsOfService());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long leaveTypeApplicabilityId = (Long)attributes.get(
				"leaveTypeApplicabilityId");

		if (leaveTypeApplicabilityId != null) {
			setLeaveTypeApplicabilityId(leaveTypeApplicabilityId);
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

		Long leaveTypeId = (Long)attributes.get("leaveTypeId");

		if (leaveTypeId != null) {
			setLeaveTypeId(leaveTypeId);
		}

		Boolean ifYearsOfServiceCriterionApplicable = (Boolean)attributes.get(
				"ifYearsOfServiceCriterionApplicable");

		if (ifYearsOfServiceCriterionApplicable != null) {
			setIfYearsOfServiceCriterionApplicable(ifYearsOfServiceCriterionApplicable);
		}

		String minYearsOfService = (String)attributes.get("minYearsOfService");

		if (minYearsOfService != null) {
			setMinYearsOfService(minYearsOfService);
		}

		String maxYearsOfService = (String)attributes.get("maxYearsOfService");

		if (maxYearsOfService != null) {
			setMaxYearsOfService(maxYearsOfService);
		}
	}

	@Override
	public long getLeaveTypeApplicabilityId() {
		return _leaveTypeApplicabilityId;
	}

	@Override
	public void setLeaveTypeApplicabilityId(long leaveTypeApplicabilityId) {
		_leaveTypeApplicabilityId = leaveTypeApplicabilityId;
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
	public long getLeaveTypeId() {
		return _leaveTypeId;
	}

	@Override
	public void setLeaveTypeId(long leaveTypeId) {
		_columnBitmask |= LEAVETYPEID_COLUMN_BITMASK;

		if (!_setOriginalLeaveTypeId) {
			_setOriginalLeaveTypeId = true;

			_originalLeaveTypeId = _leaveTypeId;
		}

		_leaveTypeId = leaveTypeId;
	}

	public long getOriginalLeaveTypeId() {
		return _originalLeaveTypeId;
	}

	@Override
	public boolean getIfYearsOfServiceCriterionApplicable() {
		return _ifYearsOfServiceCriterionApplicable;
	}

	@Override
	public boolean isIfYearsOfServiceCriterionApplicable() {
		return _ifYearsOfServiceCriterionApplicable;
	}

	@Override
	public void setIfYearsOfServiceCriterionApplicable(
		boolean ifYearsOfServiceCriterionApplicable) {
		_ifYearsOfServiceCriterionApplicable = ifYearsOfServiceCriterionApplicable;
	}

	@Override
	public String getMinYearsOfService() {
		if (_minYearsOfService == null) {
			return StringPool.BLANK;
		}
		else {
			return _minYearsOfService;
		}
	}

	@Override
	public void setMinYearsOfService(String minYearsOfService) {
		_minYearsOfService = minYearsOfService;
	}

	@Override
	public String getMaxYearsOfService() {
		if (_maxYearsOfService == null) {
			return StringPool.BLANK;
		}
		else {
			return _maxYearsOfService;
		}
	}

	@Override
	public void setMaxYearsOfService(String maxYearsOfService) {
		_maxYearsOfService = maxYearsOfService;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			LeaveTypeApplicability.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public LeaveTypeApplicability toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LeaveTypeApplicability)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LeaveTypeApplicabilityImpl leaveTypeApplicabilityImpl = new LeaveTypeApplicabilityImpl();

		leaveTypeApplicabilityImpl.setLeaveTypeApplicabilityId(getLeaveTypeApplicabilityId());
		leaveTypeApplicabilityImpl.setCompanyId(getCompanyId());
		leaveTypeApplicabilityImpl.setGroupId(getGroupId());
		leaveTypeApplicabilityImpl.setCreateDate(getCreateDate());
		leaveTypeApplicabilityImpl.setModifiedDate(getModifiedDate());
		leaveTypeApplicabilityImpl.setUserId(getUserId());
		leaveTypeApplicabilityImpl.setLeaveTypeId(getLeaveTypeId());
		leaveTypeApplicabilityImpl.setIfYearsOfServiceCriterionApplicable(getIfYearsOfServiceCriterionApplicable());
		leaveTypeApplicabilityImpl.setMinYearsOfService(getMinYearsOfService());
		leaveTypeApplicabilityImpl.setMaxYearsOfService(getMaxYearsOfService());

		leaveTypeApplicabilityImpl.resetOriginalValues();

		return leaveTypeApplicabilityImpl;
	}

	@Override
	public int compareTo(LeaveTypeApplicability leaveTypeApplicability) {
		long primaryKey = leaveTypeApplicability.getPrimaryKey();

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

		if (!(obj instanceof LeaveTypeApplicability)) {
			return false;
		}

		LeaveTypeApplicability leaveTypeApplicability = (LeaveTypeApplicability)obj;

		long primaryKey = leaveTypeApplicability.getPrimaryKey();

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
		LeaveTypeApplicabilityModelImpl leaveTypeApplicabilityModelImpl = this;

		leaveTypeApplicabilityModelImpl._originalGroupId = leaveTypeApplicabilityModelImpl._groupId;

		leaveTypeApplicabilityModelImpl._setOriginalGroupId = false;

		leaveTypeApplicabilityModelImpl._originalLeaveTypeId = leaveTypeApplicabilityModelImpl._leaveTypeId;

		leaveTypeApplicabilityModelImpl._setOriginalLeaveTypeId = false;

		leaveTypeApplicabilityModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<LeaveTypeApplicability> toCacheModel() {
		LeaveTypeApplicabilityCacheModel leaveTypeApplicabilityCacheModel = new LeaveTypeApplicabilityCacheModel();

		leaveTypeApplicabilityCacheModel.leaveTypeApplicabilityId = getLeaveTypeApplicabilityId();

		leaveTypeApplicabilityCacheModel.companyId = getCompanyId();

		leaveTypeApplicabilityCacheModel.groupId = getGroupId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			leaveTypeApplicabilityCacheModel.createDate = createDate.getTime();
		}
		else {
			leaveTypeApplicabilityCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			leaveTypeApplicabilityCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			leaveTypeApplicabilityCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		leaveTypeApplicabilityCacheModel.userId = getUserId();

		leaveTypeApplicabilityCacheModel.leaveTypeId = getLeaveTypeId();

		leaveTypeApplicabilityCacheModel.ifYearsOfServiceCriterionApplicable = getIfYearsOfServiceCriterionApplicable();

		leaveTypeApplicabilityCacheModel.minYearsOfService = getMinYearsOfService();

		String minYearsOfService = leaveTypeApplicabilityCacheModel.minYearsOfService;

		if ((minYearsOfService != null) && (minYearsOfService.length() == 0)) {
			leaveTypeApplicabilityCacheModel.minYearsOfService = null;
		}

		leaveTypeApplicabilityCacheModel.maxYearsOfService = getMaxYearsOfService();

		String maxYearsOfService = leaveTypeApplicabilityCacheModel.maxYearsOfService;

		if ((maxYearsOfService != null) && (maxYearsOfService.length() == 0)) {
			leaveTypeApplicabilityCacheModel.maxYearsOfService = null;
		}

		return leaveTypeApplicabilityCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{leaveTypeApplicabilityId=");
		sb.append(getLeaveTypeApplicabilityId());
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
		sb.append(", leaveTypeId=");
		sb.append(getLeaveTypeId());
		sb.append(", ifYearsOfServiceCriterionApplicable=");
		sb.append(getIfYearsOfServiceCriterionApplicable());
		sb.append(", minYearsOfService=");
		sb.append(getMinYearsOfService());
		sb.append(", maxYearsOfService=");
		sb.append(getMaxYearsOfService());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.LeaveTypeApplicability");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>leaveTypeApplicabilityId</column-name><column-value><![CDATA[");
		sb.append(getLeaveTypeApplicabilityId());
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
			"<column><column-name>leaveTypeId</column-name><column-value><![CDATA[");
		sb.append(getLeaveTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ifYearsOfServiceCriterionApplicable</column-name><column-value><![CDATA[");
		sb.append(getIfYearsOfServiceCriterionApplicable());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>minYearsOfService</column-name><column-value><![CDATA[");
		sb.append(getMinYearsOfService());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maxYearsOfService</column-name><column-value><![CDATA[");
		sb.append(getMaxYearsOfService());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = LeaveTypeApplicability.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			LeaveTypeApplicability.class
		};
	private long _leaveTypeApplicabilityId;
	private long _companyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
	private String _userUuid;
	private long _leaveTypeId;
	private long _originalLeaveTypeId;
	private boolean _setOriginalLeaveTypeId;
	private boolean _ifYearsOfServiceCriterionApplicable;
	private String _minYearsOfService;
	private String _maxYearsOfService;
	private long _columnBitmask;
	private LeaveTypeApplicability _escapedModel;
}