package proxy.staticProxy.commonProxy.extension;

public class RealSubject implements Subject {

    //只能通过代理类创建真实角色实体对象
    public RealSubject(Subject proxySubject) throws Exception {
        if(isProxy(proxySubject)){
            //dosomething
        }else{
            throw new Exception("不能创建真实角色类");
        }
    }

    @Override
    public void doSomeThing() {

    }

    public boolean isProxy(Subject proxy){
        if(proxy==null){
            return false;
        }
        return true;
    }

}
