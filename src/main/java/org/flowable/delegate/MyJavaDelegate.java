package org.flowable.delegate;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class MyJavaDelegate implements JavaDelegate {

  @Override
  public void execute(DelegateExecution execution) {
    Integer var = (Integer) execution.getVariable("var");
    execution.setVariable("var", var * 10);
  }
  
}
