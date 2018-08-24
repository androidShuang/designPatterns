package chainOfResponsibility;

public abstract class Handler {

    private Handler nextHandler;

    public final Response handleMessage(Request request){
        Response response = null;
        if(this.getLevel().equals(request.getRequestLevel())){
            response = this.echo(request);
        }else{
            if(this.nextHandler!=null){
                response = this.nextHandler.handleMessage(request);
            }else{
                //其他业务处理
            }
        }
        return response;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract Level getLevel();
    protected abstract Response echo(Request request);

}
