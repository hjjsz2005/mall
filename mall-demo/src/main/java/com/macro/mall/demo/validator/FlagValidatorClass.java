package com.macro.mall.demo.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 状态标记校验器
 */
public class FlagValidatorClass implements ConstraintValidator<FlagValidator,Integer> {
    private String[] values;
    @Override
    public void initialize(FlagValidator flagValidator) {
        this.values = flagValidator.value();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        boolean isValid = false;
        for(int i=0;i<values.length;i++){
            if(values[i].equals(String.valueOf(value))){
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    private void test() {
        System.out.println("testing");
    }
    private void test2() {
        System.out.println("testing");
    }
    private void test3() {
        System.out.println("testing");
    }
    private void test4() {
        System.out.println("testing");
    }
    private void test5() {
        System.out.println("testing");
    }
}
