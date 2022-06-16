package com.bistu.store.util;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.ToString;
//
//import java.io.Serializable;
//
///**
// * Json格式的数据进行响应
// * 创建响应
// * 向后端服务器发送请求，目的将用户数据发送到数据库端
// */
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//public class JsonResult<E> implements Serializable {
//    /**状态码*/
//    private Integer state;
//    /**描述信息*/
//    private String message;
//    /**数据*/
//    private E data;//用泛型
//
//    public JsonResult(Throwable e){//关于异常的捕获，将异常情况传递
//        this.message=e.getMessage();
//    }
//
//
//    public  JsonResult(Integer state){
//        this.state=state;
//    }
//}
import java.io.Serializable;

/**
 * 响应结果类
 * @param <E> 响应数据的类型
 */
public class JsonResult<E> implements Serializable {
    /** 状态码 */
    private Integer state;
    /** 状态描述信息 */
    private String message;
    /** 数据 */
    private E data;

    public JsonResult() {
        super();
    }

    public JsonResult(Integer state) {
        super();
        this.state = state;
    }

    /** 出现异常时调用 */
    public JsonResult(Throwable e) {
        super();
        // 获取异常对象中的异常信息
        this.message = e.getMessage();
    }

    public JsonResult(Integer state, E data) {
        super();
        this.state = state;
        this.data = data;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
