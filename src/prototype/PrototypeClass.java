package prototype;

import java.util.ArrayList;

public class PrototypeClass implements Cloneable{
    //类的成员变量不会被浅拷贝
    //引用类型，数组不浅拷贝
    //String 特殊，相当于基本类型，浅拷贝
    private ArrayList<String> arrayList = new ArrayList<>();
    @Override
    protected PrototypeClass clone(){
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //深拷贝
        prototypeClass.arrayList = (ArrayList<String>) this.arrayList.clone();
        return prototypeClass;
    }
}
