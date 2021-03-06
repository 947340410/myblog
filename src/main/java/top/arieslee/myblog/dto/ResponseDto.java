package top.arieslee.myblog.dto;

/**
 * @ClassName ResponseDto
 * @Description 封装响应请求传输数据
 * @Author Aries
 * @Date 2018/7/19 15:23
 * @Version 1.0
 **/
public class ResponseDto<T> {
    /**
     * @Description 响应状态
     **/
    private boolean success;

    /**
     * @Description 状态码
     **/
    private int code = -1;

    /**
     * @Description 封装数据
     **/
    private T data;

    /**
     * @Description 响应信息
     **/
    private String msg;

    public ResponseDto(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public ResponseDto(boolean success) {
        this.success = success;
    }

    public static ResponseDto fail(String msg) {
        return new ResponseDto(false, msg);
    }

    public static ResponseDto ok() {
        return new ResponseDto(true);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
