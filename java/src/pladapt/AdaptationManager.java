/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package pladapt;

public class AdaptationManager {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AdaptationManager(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AdaptationManager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pladaptJNI.delete_AdaptationManager(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDebug(boolean debug) {
    pladaptJNI.AdaptationManager_setDebug(swigCPtr, this, debug);
  }

  public boolean supportsStrategy() {
    return pladaptJNI.AdaptationManager_supportsStrategy(swigCPtr, this);
  }

  public SWIGTYPE_p_std__shared_ptrT_std__listT_std__setT_std__string_t_t_t getStrategy() {
    return new SWIGTYPE_p_std__shared_ptrT_std__listT_std__setT_std__string_t_t_t(pladaptJNI.AdaptationManager_getStrategy(swigCPtr, this), true);
  }

}