package chapter4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jasonli822 on 2016/5/4.
 * 文档类型，扮演的是ConcretePrototype角色，而cloneable是代表prototype角色
 */
public class WordDocument implements Cloneable {
    // 文本
    private String mText;
    // 图片名列表
    private ArrayList<String> mImages = new ArrayList<String>();

    public WordDocument() {
        System.out.println("------ WordDocument构造函数 ------");
    }

    /**
     * 克隆对象
     * @return
     */
    @Override
    protected WordDocument clone() {
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
            // 对mImages对象也调用clone()函数，进行深拷贝
            doc.mImages = (ArrayList<String>) this.mImages.clone();
            return doc;
        } catch(Exception e) {
        }
        return null;
    }

    public String getText() {
        return mText;
    }
    public void setText(String mText) {
        this.mText = mText;
    }
    public List<String> getImages() {
        return mImages;
    }
    public void addImage(String image) {
        this.mImages.add(image);
    }

    /**
     * 打印文档内容
     */
    public void showDocument() {
        System.out.println("------ Word Content Start ------");
        System.out.println("Text :" + mText);
        System.out.println("Image List: ");
        for (String imgName : mImages) {
            System.out.println("image name :" + imgName);
        }
        System.out.println("------ Word Content End ------");
    }
}
