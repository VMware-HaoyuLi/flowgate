/**
 * Copyright 2019 VMware, Inc.
 * SPDX-License-Identifier: BSD-2-Clause
*/
package com.vmware.flowgate.common;

public class FlowgateConstant {

   public static int maxPageSize = 1000;

   public static int defaultPageSize = 20;

   public static int defaultPageNumber = 1;

   public static String serviceKey = "FLOWGATESERVICEKEY";

   public static String systemUser = "systemUser";

   public static int COUCHBASEIDLENGTH = 32;

   public static String PDU_SOURCE = "PDU_SOURCE";

   /**
    * Unique id of asset generated by FLOWGATE
    */
   public static String PDU_ASSET_ID = "PDU_ASSET_ID";

   /**
    * Unique id of sensor generated by PowerIQ
    */
   public static String SENSOR_ID_FROM_POWERIQ = "SENSOR_ID_FROM_POWERIQ";

   /**
    * Unique id of PDU generated by PowerIQ
    */
   public static String PDU_ID_FROM_POWERIQ = "PDU_ID_FROM_POWERIQ";

   public static String PDU_PORT_FOR_SERVER = "DEVICE_PORT_FOR_SERVER";

   /**
    * Record the nic and port mapping information on a network device.
    */
   public static String NETWORK_PORT_FOR_SERVER = "NETWORK_PORT_FOR_SERVER";

   public static String NETWORK = "NETWORK";

   public static String PDU_OUTLETS_FROM_POWERIQ = "PDU_OUTLETS_FROM_POWERIQ";

   public static String PDU_INLETS_FROM_POWERIQ = "PDU_INLETS_FROM_POWERIQ";

   public static String PDU_MAX_RATE_POWER = "PDU_MAX_RATE_POWER";

   public static String PDU_MIN_RATE_POWER = "PDU_MIN_RATE_POWER";

   public static String PDU_RATE_AMPS = "PDU_RATE_AMPS";

   public static String PDU_MIN_RATE_VOLTS = "PDU_MIN_RATE_VOLTS";

   public static String PDU_MAX_RATE_VOLTS = "PDU_MAX_RATE_VOLTS";

   public static String POSITION = "POSITION";

   public static String PDU = "PDU";

   public static String SENSOR = "SENSOR";

   public static String DEFAULT_CABINET_UNIT_POSITION = "COMMON";

   public static String OUTLET_NAME_PREFIX = "OUTLET:";

   public static String INLET_NAME_PREFIX = "INLET:";

   public static String SEPARATOR = "_FIELDSPLIT_";

   public static String UNDERLINE = "_";

   public static String RACK_UNIT_PREFIX = "rackUnit";

   public static String SPILIT_FLAG = ",";

   public static int MAXNUMBEROFRETRIES = 3;

   public static int DEFAULTNUMBEROFRETRIES = 0;

   public static long DEFAULTEXPIREDTIMERANGE = 90*24*3600*1000l;//three months

   public static String Role_admin = "admin";
}
