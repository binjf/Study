package com.sky.study.patterns.factory.abstracts;

import com.sky.study.patterns.factory.abstracts.po.BoyInterface;
import com.sky.study.patterns.factory.abstracts.po.GirlInterface;

/**
 * 获取人物接口
 *
 * @author Sky
 * @Date 2019-01-27 14:11.
 */
public interface PersonFactory {
    /**
     * 男孩接口
     * @return
     */
    BoyInterface getBoy();

    /**
     * 女孩接口
     * @return
     */
    GirlInterface getGirl();
}
