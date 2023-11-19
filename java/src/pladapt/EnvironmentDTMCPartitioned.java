/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package pladapt;

public class EnvironmentDTMCPartitioned extends DTMCPartitionedStates {
  private transient long swigCPtr;

  protected EnvironmentDTMCPartitioned(long cPtr, boolean cMemoryOwn) {
    super(pladaptJNI.EnvironmentDTMCPartitioned_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EnvironmentDTMCPartitioned obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pladaptJNI.delete_EnvironmentDTMCPartitioned(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public EnvironmentDTMCPartitioned(long numberOfStates) {
    this(pladaptJNI.new_EnvironmentDTMCPartitioned(numberOfStates), true);
  }

  public static EnvironmentDTMCPartitioned createJointDTMC(EnvironmentDTMCPartitioned a, EnvironmentDTMCPartitioned b) {
    return new EnvironmentDTMCPartitioned(pladaptJNI.EnvironmentDTMCPartitioned_createJointDTMC(EnvironmentDTMCPartitioned.getCPtr(a), a, EnvironmentDTMCPartitioned.getCPtr(b), b), true);
  }

  public String toString() {
    return pladaptJNI.EnvironmentDTMCPartitioned_toString(swigCPtr, this);
  }

}
