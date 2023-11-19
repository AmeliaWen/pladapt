/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package pladapt;

public class pladaptJNI {
  public final static native long Environment_getNumberOfComponents(long jarg1, Environment jarg1_);
  public final static native long Environment_getNumberOfComponentsSwigExplicitEnvironment(long jarg1, Environment jarg1_);
  public final static native long Environment_getComponent(long jarg1, Environment jarg1_, long jarg2);
  public final static native long Environment_getComponentSwigExplicitEnvironment(long jarg1, Environment jarg1_, long jarg2);
  public final static native double Environment_asDouble(long jarg1, Environment jarg1_);
  public final static native double Environment_asDoubleSwigExplicitEnvironment(long jarg1, Environment jarg1_);
  public final static native int Environment_getType(long jarg1, Environment jarg1_);
  public final static native int Environment_getTypeSwigExplicitEnvironment(long jarg1, Environment jarg1_);
  public final static native void delete_Environment(long jarg1);
  public final static native Object Environment_swigOriginalObject(long jarg1, Environment jarg1_);
  public final static native String Environment_toString(long jarg1, Environment jarg1_);
  public final static native long new_Environment();
  public final static native void Environment_director_connect(Environment obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void Environment_change_ownership(Environment obj, long cptr, boolean take_or_release);
  public final static native int Configuration_getType(long jarg1, Configuration jarg1_);
  public final static native int Configuration_getTypeSwigExplicitConfiguration(long jarg1, Configuration jarg1_);
  public final static native void delete_Configuration(long jarg1);
  public final static native boolean Configuration_equals(long jarg1, Configuration jarg1_, long jarg2, Configuration jarg2_);
  public final static native Object Configuration_swigOriginalObject(long jarg1, Configuration jarg1_);
  public final static native String Configuration_toString(long jarg1, Configuration jarg1_);
  public final static native long new_Configuration();
  public final static native void Configuration_director_connect(Configuration obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void Configuration_change_ownership(Configuration obj, long cptr, boolean take_or_release);
  public final static native void delete_GenericConfiguration(long jarg1);
  public final static native boolean GenericConfiguration_isEqual(long jarg1, GenericConfiguration jarg1_, long jarg2, GenericConfiguration jarg2_);
  public final static native int GenericConfiguration_getType(long jarg1, GenericConfiguration jarg1_);
  public final static native int GenericConfiguration_getTypeSwigExplicitGenericConfiguration(long jarg1, GenericConfiguration jarg1_);
  public final static native boolean GenericConfiguration_equals(long jarg1, GenericConfiguration jarg1_, long jarg2, Configuration jarg2_);
  public final static native boolean GenericConfiguration_equalsSwigExplicitGenericConfiguration(long jarg1, GenericConfiguration jarg1_, long jarg2, Configuration jarg2_);
  public final static native double GenericConfiguration_getDouble(long jarg1, GenericConfiguration jarg1_, String jarg2);
  public final static native void GenericConfiguration_setDouble(long jarg1, GenericConfiguration jarg1_, String jarg2, double jarg3);
  public final static native int GenericConfiguration_getInt(long jarg1, GenericConfiguration jarg1_, String jarg2);
  public final static native void GenericConfiguration_setInt(long jarg1, GenericConfiguration jarg1_, String jarg2, int jarg3);
  public final static native boolean GenericConfiguration_getBool(long jarg1, GenericConfiguration jarg1_, String jarg2);
  public final static native void GenericConfiguration_setBool(long jarg1, GenericConfiguration jarg1_, String jarg2, boolean jarg3);
  public final static native String GenericConfiguration_toString(long jarg1, GenericConfiguration jarg1_);
  public final static native long new_GenericConfiguration();
  public final static native void GenericConfiguration_director_connect(GenericConfiguration obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void GenericConfiguration_change_ownership(GenericConfiguration obj, long cptr, boolean take_or_release);
  public final static native long new_GenericEnvironment__SWIG_0();
  public final static native long new_GenericEnvironment__SWIG_1(String jarg1);
  public final static native void delete_GenericEnvironment(long jarg1);
  public final static native double GenericEnvironment_asDouble(long jarg1, GenericEnvironment jarg1_);
  public final static native double GenericEnvironment_asDoubleSwigExplicitGenericEnvironment(long jarg1, GenericEnvironment jarg1_);
  public final static native int GenericEnvironment_getType(long jarg1, GenericEnvironment jarg1_);
  public final static native int GenericEnvironment_getTypeSwigExplicitGenericEnvironment(long jarg1, GenericEnvironment jarg1_);
  public final static native boolean GenericEnvironment_isEqual(long jarg1, GenericEnvironment jarg1_, long jarg2, GenericEnvironment jarg2_);
  public final static native boolean GenericEnvironment_equals(long jarg1, GenericEnvironment jarg1_, long jarg2, Environment jarg2_);
  public final static native boolean GenericEnvironment_equalsSwigExplicitGenericEnvironment(long jarg1, GenericEnvironment jarg1_, long jarg2, Environment jarg2_);
  public final static native double GenericEnvironment_getDouble(long jarg1, GenericEnvironment jarg1_, String jarg2);
  public final static native void GenericEnvironment_setDouble(long jarg1, GenericEnvironment jarg1_, String jarg2, double jarg3);
  public final static native int GenericEnvironment_getInt(long jarg1, GenericEnvironment jarg1_, String jarg2);
  public final static native void GenericEnvironment_setInt(long jarg1, GenericEnvironment jarg1_, String jarg2, int jarg3);
  public final static native String GenericEnvironment_toString(long jarg1, GenericEnvironment jarg1_);
  public final static native void GenericEnvironment_director_connect(GenericEnvironment obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void GenericEnvironment_change_ownership(GenericEnvironment obj, long cptr, boolean take_or_release);
  public final static native long new_JointEnvironment(long jarg1, long jarg2);
  public final static native long JointEnvironment_getNumberOfComponents(long jarg1, JointEnvironment jarg1_);
  public final static native long JointEnvironment_getNumberOfComponentsSwigExplicitJointEnvironment(long jarg1, JointEnvironment jarg1_);
  public final static native long JointEnvironment_getComponent(long jarg1, JointEnvironment jarg1_, long jarg2);
  public final static native long JointEnvironment_getComponentSwigExplicitJointEnvironment(long jarg1, JointEnvironment jarg1_, long jarg2);
  public final static native int JointEnvironment_getType(long jarg1, JointEnvironment jarg1_);
  public final static native int JointEnvironment_getTypeSwigExplicitJointEnvironment(long jarg1, JointEnvironment jarg1_);
  public final static native void delete_JointEnvironment(long jarg1);
  public final static native void JointEnvironment_director_connect(JointEnvironment obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void JointEnvironment_change_ownership(JointEnvironment obj, long cptr, boolean take_or_release);
  public final static native void delete_GenericConfigurationManager(long jarg1);
  public final static native long GenericConfigurationManager_getConfigurationTemplate(long jarg1, GenericConfigurationManager jarg1_);
  public final static native long GenericConfigurationManager_addNewConfiguration(long jarg1, GenericConfigurationManager jarg1_);
  public final static native long new_GenericConfigurationManager();
  public final static native double UtilityFunction_getAdditiveUtility(long jarg1, UtilityFunction jarg1_, long jarg2, Configuration jarg2_, long jarg3, Environment jarg3_, int jarg4);
  public final static native double UtilityFunction_getAdditiveUtilitySwigExplicitUtilityFunction(long jarg1, UtilityFunction jarg1_, long jarg2, Configuration jarg2_, long jarg3, Environment jarg3_, int jarg4);
  public final static native double UtilityFunction_getMultiplicativeUtility(long jarg1, UtilityFunction jarg1_, long jarg2, Configuration jarg2_, long jarg3, Environment jarg3_, int jarg4);
  public final static native double UtilityFunction_getMultiplicativeUtilitySwigExplicitUtilityFunction(long jarg1, UtilityFunction jarg1_, long jarg2, Configuration jarg2_, long jarg3, Environment jarg3_, int jarg4);
  public final static native double UtilityFunction_getFinalReward(long jarg1, UtilityFunction jarg1_, long jarg2, Configuration jarg2_, long jarg3, Environment jarg3_, int jarg4);
  public final static native double UtilityFunction_getFinalRewardSwigExplicitUtilityFunction(long jarg1, UtilityFunction jarg1_, long jarg2, Configuration jarg2_, long jarg3, Environment jarg3_, int jarg4);
  public final static native double UtilityFunction_getAdaptationReward(long jarg1, UtilityFunction jarg1_, long jarg2, Configuration jarg2_, long jarg3, Configuration jarg3_, int jarg4);
  public final static native double UtilityFunction_getAdaptationRewardSwigExplicitUtilityFunction(long jarg1, UtilityFunction jarg1_, long jarg2, Configuration jarg2_, long jarg3, Configuration jarg3_, int jarg4);
  public final static native void delete_UtilityFunction(long jarg1);
  public final static native long new_UtilityFunction();
  public final static native void UtilityFunction_director_connect(UtilityFunction obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void UtilityFunction_change_ownership(UtilityFunction obj, long cptr, boolean take_or_release);
  public final static native void delete_GenericUtilityFunction(long jarg1);
  public final static native double GenericUtilityFunction_getGenAdditiveUtility(long jarg1, GenericUtilityFunction jarg1_, long jarg2, GenericConfiguration jarg2_, long jarg3, GenericEnvironment jarg3_, int jarg4);
  public final static native double GenericUtilityFunction_getGenAdditiveUtilitySwigExplicitGenericUtilityFunction(long jarg1, GenericUtilityFunction jarg1_, long jarg2, GenericConfiguration jarg2_, long jarg3, GenericEnvironment jarg3_, int jarg4);
  public final static native double GenericUtilityFunction_getGenMultiplicativeUtility(long jarg1, GenericUtilityFunction jarg1_, long jarg2, GenericConfiguration jarg2_, long jarg3, GenericEnvironment jarg3_, int jarg4);
  public final static native double GenericUtilityFunction_getGenMultiplicativeUtilitySwigExplicitGenericUtilityFunction(long jarg1, GenericUtilityFunction jarg1_, long jarg2, GenericConfiguration jarg2_, long jarg3, GenericEnvironment jarg3_, int jarg4);
  public final static native double GenericUtilityFunction_getGenFinalReward(long jarg1, GenericUtilityFunction jarg1_, long jarg2, GenericConfiguration jarg2_, long jarg3, GenericEnvironment jarg3_, int jarg4);
  public final static native double GenericUtilityFunction_getGenFinalRewardSwigExplicitGenericUtilityFunction(long jarg1, GenericUtilityFunction jarg1_, long jarg2, GenericConfiguration jarg2_, long jarg3, GenericEnvironment jarg3_, int jarg4);
  public final static native double GenericUtilityFunction_getGenAdaptationReward(long jarg1, GenericUtilityFunction jarg1_, long jarg2, GenericConfiguration jarg2_, long jarg3, GenericConfiguration jarg3_, int jarg4);
  public final static native double GenericUtilityFunction_getGenAdaptationRewardSwigExplicitGenericUtilityFunction(long jarg1, GenericUtilityFunction jarg1_, long jarg2, GenericConfiguration jarg2_, long jarg3, GenericConfiguration jarg3_, int jarg4);
  public final static native long new_GenericUtilityFunction();
  public final static native void GenericUtilityFunction_director_connect(GenericUtilityFunction obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void GenericUtilityFunction_change_ownership(GenericUtilityFunction obj, long cptr, boolean take_or_release);
  public final static native long new_DTMCPartitionedStates(long jarg1);
  public final static native void DTMCPartitionedStates_setTransitionProbability(long jarg1, DTMCPartitionedStates jarg1_, long jarg2, long jarg3, double jarg4);
  public final static native void DTMCPartitionedStates_assignToPart(long jarg1, DTMCPartitionedStates jarg1_, long jarg2, long jarg3);
  public final static native long DTMCPartitionedStates_getNumberOfParts(long jarg1, DTMCPartitionedStates jarg1_);
  public final static native boolean DTMCPartitionedStates_isLastPartFinal(long jarg1, DTMCPartitionedStates jarg1_);
  public final static native void delete_DTMCPartitionedStates(long jarg1);
  public final static native long new_EnvironmentDTMCPartitioned(long jarg1);
  public final static native void delete_EnvironmentDTMCPartitioned(long jarg1);
  public final static native long EnvironmentDTMCPartitioned_createJointDTMC(long jarg1, EnvironmentDTMCPartitioned jarg1_, long jarg2, EnvironmentDTMCPartitioned jarg2_);
  public final static native String EnvironmentDTMCPartitioned_toString(long jarg1, EnvironmentDTMCPartitioned jarg1_);
  public final static native long new_GenericEnvironmentDTMCPartitioned(long jarg1);
  public final static native void delete_GenericEnvironmentDTMCPartitioned(long jarg1);
  public final static native void GenericEnvironmentDTMCPartitioned_setStateValue(long jarg1, GenericEnvironmentDTMCPartitioned jarg1_, long jarg2, long jarg3, GenericEnvironment jarg3_);
  public final static native long new_StringVector__SWIG_0();
  public final static native long new_StringVector__SWIG_1(long jarg1);
  public final static native long StringVector_size(long jarg1, StringVector jarg1_);
  public final static native long StringVector_capacity(long jarg1, StringVector jarg1_);
  public final static native void StringVector_reserve(long jarg1, StringVector jarg1_, long jarg2);
  public final static native boolean StringVector_isEmpty(long jarg1, StringVector jarg1_);
  public final static native void StringVector_clear(long jarg1, StringVector jarg1_);
  public final static native void StringVector_add(long jarg1, StringVector jarg1_, String jarg2);
  public final static native String StringVector_get(long jarg1, StringVector jarg1_, int jarg2);
  public final static native void StringVector_set(long jarg1, StringVector jarg1_, int jarg2, String jarg3);
  public final static native void delete_StringVector(long jarg1);
  public final static native void AdaptationManager_setDebug(long jarg1, AdaptationManager jarg1_, boolean jarg2);
  public final static native boolean AdaptationManager_supportsStrategy(long jarg1, AdaptationManager jarg1_);
  public final static native long AdaptationManager_getStrategy(long jarg1, AdaptationManager jarg1_);
  public final static native void delete_AdaptationManager(long jarg1);
  public final static native String SDPAdaptationManager_NO_LATENCY_get();
  public final static native String SDPAdaptationManager_REACH_OPTIONS_get();
  public final static native String SDPAdaptationManager_REACH_PATH_get();
  public final static native String SDPAdaptationManager_REACH_PREFIX_get();
  public final static native String SDPAdaptationManager_REACH_MODEL_get();
  public final static native String SDPAdaptationManager_REACH_SCOPE_get();
  public final static native long new_SDPAdaptationManager();
  public final static native boolean SDPAdaptationManager_supportsStrategy(long jarg1, SDPAdaptationManager jarg1_);
  public final static native long SDPAdaptationManager_getStrategy(long jarg1, SDPAdaptationManager jarg1_);
  public final static native void delete_SDPAdaptationManager(long jarg1);
  public final static native void delete_JavaSDPAdaptationManager(long jarg1);
  public final static native void JavaSDPAdaptationManager_initialize(long jarg1, JavaSDPAdaptationManager jarg1_, long jarg2, GenericConfigurationManager jarg2_, String jarg3);
  public final static native long JavaSDPAdaptationManager_evaluate(long jarg1, JavaSDPAdaptationManager jarg1_, long jarg2, Configuration jarg2_, long jarg3, EnvironmentDTMCPartitioned jarg3_, long jarg4, UtilityFunction jarg4_, long jarg5);
  public final static native long new_JavaSDPAdaptationManager();
  public final static native double testGeneric(long jarg1, GenericUtilityFunction jarg1_, long jarg2, GenericConfiguration jarg2_, long jarg3, GenericEnvironment jarg3_);
  public final static native double testUtilityFunction(long jarg1, UtilityFunction jarg1_, long jarg2, Configuration jarg2_, long jarg3, Environment jarg3_);
  public final static native double testUtilityFunctionWithConfigMgr(long jarg1, UtilityFunction jarg1_, long jarg2, GenericConfigurationManager jarg2_, long jarg3, Environment jarg3_);
  public final static native long TimeSeriesPredictor_getInstance__SWIG_0(long jarg1, StringVector jarg1_, long jarg2, long jarg3);
  public final static native long TimeSeriesPredictor_getInstance__SWIG_1(String jarg1, long jarg2, long jarg3);
  public final static native long TimeSeriesPredictor_getTrainingLength(long jarg1, TimeSeriesPredictor jarg1_);
  public final static native void TimeSeriesPredictor_observe(long jarg1, TimeSeriesPredictor jarg1_, double jarg2);
  public final static native void TimeSeriesPredictor_predict__SWIG_0(long jarg1, TimeSeriesPredictor jarg1_, long jarg2, double[] jarg3, double[] jarg4);
  public final static native void TimeSeriesPredictor_predict__SWIG_1(long jarg1, TimeSeriesPredictor jarg1_, long jarg2, double[] jarg3);
  public final static native long TimeSeriesPredictor_clone(long jarg1, TimeSeriesPredictor jarg1_);
  public final static native void TimeSeriesPredictor_predict__SWIG_2(long jarg1, TimeSeriesPredictor jarg1_, double jarg2, double jarg3, long jarg4, double[] jarg5, double[] jarg6);
  public final static native void TimeSeriesPredictor_predict__SWIG_3(long jarg1, TimeSeriesPredictor jarg1_, double jarg2, double jarg3, long jarg4, double[] jarg5);
  public final static native void delete_TimeSeriesPredictor(long jarg1);
  public final static native long TimeSeriesPredictor_generateEnvironmentDTMC__SWIG_0(long jarg1, TimeSeriesPredictor jarg1_, long jarg2, long jarg3, double jarg4);
  public final static native long TimeSeriesPredictor_generateEnvironmentDTMC__SWIG_1(long jarg1, TimeSeriesPredictor jarg1_, long jarg2, long jarg3);
  public final static native long TimeSeriesPredictor_generateEnvironmentDTMC__SWIG_2(long jarg1, TimeSeriesPredictor jarg1_, long jarg2);
  public final static native String PMCAdaptationManager_generateEnvironmentDTMC(long jarg1, EnvironmentDTMCPartitioned jarg1_);
  public final static native void PMCAdaptationManager_NO_LATENCY_set(String jarg1);
  public final static native String PMCAdaptationManager_NO_LATENCY_get();
  public final static native void PMCAdaptationManager_TEMPLATE_PATH_set(String jarg1);
  public final static native String PMCAdaptationManager_TEMPLATE_PATH_get();
  public final static native long new_PMCAdaptationManager();
  public final static native void delete_PMCAdaptationManager(long jarg1);
  public final static native long GenericConfiguration_SWIGUpcast(long jarg1);
  public final static native long GenericEnvironment_SWIGUpcast(long jarg1);
  public final static native long JointEnvironment_SWIGUpcast(long jarg1);
  public final static native long GenericUtilityFunction_SWIGUpcast(long jarg1);
  public final static native long EnvironmentDTMCPartitioned_SWIGUpcast(long jarg1);
  public final static native long GenericEnvironmentDTMCPartitioned_SWIGUpcast(long jarg1);
  public final static native long SDPAdaptationManager_SWIGUpcast(long jarg1);
  public final static native long JavaSDPAdaptationManager_SWIGUpcast(long jarg1);
  public final static native long PMCAdaptationManager_SWIGUpcast(long jarg1);

  public static long SwigDirector_Environment_getNumberOfComponents(Environment jself) {
    return jself.getNumberOfComponents();
  }
  public static long SwigDirector_Environment_getComponent(Environment jself, long c) {
    return Environment.getCPtr(jself.getComponent(c));
  }
  public static double SwigDirector_Environment_asDouble(Environment jself) {
    return jself.asDouble();
  }
  public static int SwigDirector_Environment_getType(Environment jself) {
    return jself.getType();
  }
  public static int SwigDirector_Configuration_getType(Configuration jself) {
    return jself.getType();
  }
  public static boolean SwigDirector_Configuration_equals(Configuration jself, long other) {
    return jself.equals(other == 0 ? null : new Configuration(other, false).swigFindRealImpl());
  }
  public static int SwigDirector_GenericConfiguration_getType(GenericConfiguration jself) {
    return jself.getType();
  }
  public static boolean SwigDirector_GenericConfiguration_equals(GenericConfiguration jself, long other) {
    return jself.equals(other == 0 ? null : new Configuration(other, false).swigFindRealImpl());
  }
  public static long SwigDirector_GenericEnvironment_getNumberOfComponents(GenericEnvironment jself) {
    return jself.getNumberOfComponents();
  }
  public static long SwigDirector_GenericEnvironment_getComponent(GenericEnvironment jself, long c) {
    return Environment.getCPtr(jself.getComponent(c));
  }
  public static double SwigDirector_GenericEnvironment_asDouble(GenericEnvironment jself) {
    return jself.asDouble();
  }
  public static int SwigDirector_GenericEnvironment_getType(GenericEnvironment jself) {
    return jself.getType();
  }
  public static boolean SwigDirector_GenericEnvironment_equals(GenericEnvironment jself, long other) {
    return jself.equals(other == 0 ? null : new Environment(other, false).swigFindRealImpl());
  }
  public static long SwigDirector_JointEnvironment_getNumberOfComponents(JointEnvironment jself) {
    return jself.getNumberOfComponents();
  }
  public static long SwigDirector_JointEnvironment_getComponent(JointEnvironment jself, long c) {
    return Environment.getCPtr(jself.getComponent(c));
  }
  public static double SwigDirector_JointEnvironment_asDouble(JointEnvironment jself) {
    return jself.asDouble();
  }
  public static int SwigDirector_JointEnvironment_getType(JointEnvironment jself) {
    return jself.getType();
  }
  public static double SwigDirector_UtilityFunction_getAdditiveUtility(UtilityFunction jself, long config, long environment, int time) {
    return jself.getAdditiveUtility(config == 0 ? null : new Configuration(config, false).swigFindRealImpl(), environment == 0 ? null : new Environment(environment, false).swigFindRealImpl(), time);
  }
  public static double SwigDirector_UtilityFunction_getMultiplicativeUtility(UtilityFunction jself, long config, long environment, int time) {
    return jself.getMultiplicativeUtility(config == 0 ? null : new Configuration(config, false).swigFindRealImpl(), environment == 0 ? null : new Environment(environment, false).swigFindRealImpl(), time);
  }
  public static double SwigDirector_UtilityFunction_getFinalReward(UtilityFunction jself, long config, long environment, int time) {
    return jself.getFinalReward(config == 0 ? null : new Configuration(config, false).swigFindRealImpl(), environment == 0 ? null : new Environment(environment, false).swigFindRealImpl(), time);
  }
  public static double SwigDirector_UtilityFunction_getAdaptationReward(UtilityFunction jself, long from, long to, int time) {
    return jself.getAdaptationReward(from == 0 ? null : new Configuration(from, false).swigFindRealImpl(), to == 0 ? null : new Configuration(to, false).swigFindRealImpl(), time);
  }
  public static double SwigDirector_GenericUtilityFunction_getGenAdditiveUtility(GenericUtilityFunction jself, long config, long environment, int time) {
    return jself.getGenAdditiveUtility(new GenericConfiguration(config, false), new GenericEnvironment(environment, false), time);
  }
  public static double SwigDirector_GenericUtilityFunction_getGenMultiplicativeUtility(GenericUtilityFunction jself, long config, long environment, int time) {
    return jself.getGenMultiplicativeUtility(new GenericConfiguration(config, false), new GenericEnvironment(environment, false), time);
  }
  public static double SwigDirector_GenericUtilityFunction_getGenFinalReward(GenericUtilityFunction jself, long config, long environment, int time) {
    return jself.getGenFinalReward(new GenericConfiguration(config, false), new GenericEnvironment(environment, false), time);
  }
  public static double SwigDirector_GenericUtilityFunction_getGenAdaptationReward(GenericUtilityFunction jself, long from, long to, int time) {
    return jself.getGenAdaptationReward(new GenericConfiguration(from, false), new GenericConfiguration(to, false), time);
  }

  private final static native void swig_module_init();
  static {
    swig_module_init();
  }
}
