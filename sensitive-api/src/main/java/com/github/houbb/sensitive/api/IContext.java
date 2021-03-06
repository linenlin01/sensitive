package com.github.houbb.sensitive.api;

import java.lang.reflect.Field;
import java.util.List;

/**
 * 脱敏的执行上下文
 * @author binbin.hou
 * date 2018/12/29
 * @since 0.0.1
 */
public interface IContext {

    /**
     * 获取所有的上下文
     * @return field 列表
     * @since 0.0.1
     */
    List<Field> getAllFieldList();

    /**
     * 获得当前字段信息
     * @return 字段信息
     * @since 0.0.1
     */
    Field getCurrentField();

    /**
     * 获取当前字段名称
     * @return 字段名称
     * @since 0.0.4
     */
    String getCurrentFieldName();

    /**
     * 获取当前字段值
     * @return 字段值
     * @since 0.0.4
     */
    Object getCurrentFieldValue();

    /**
     * 获取当前对象
     * @return 当前对象
     * @since 0.0.1
     */
    Object getCurrentObject();

}
