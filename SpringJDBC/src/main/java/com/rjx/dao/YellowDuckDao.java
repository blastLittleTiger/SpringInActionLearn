package com.rjx.dao;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:YellowDuckDao
// Date:2017/5/5.
// Copyright="(c) renjiaxin.jesse 2017'
// Licence = "prayjourney 2017"
//
//                 ┏ ┓   ┏ ┓
//              ┏━━┛ ┻━━━┛ ┻━━┓
//              ┃    #
//              ┃   ┳┛  ┗*━   ┃    蹉跎错，消磨过，最是光阴化浮沫。
//              ┃      ┻      ┃
//              ┗━━┓       ┏━━┛
//                 ┃         ┗━━━━━━━━━━┓
//                 ┃  神兽保佑           ┣━┓
//                 ┃  永无BUG！         ┏┛
//                 ┗┓━┓ ┏━━━━━━━━━┳━┓━┓┛
//                  ┃━┫━┫         ┃━┫━┫
//                  ┗━┻━┛         ┗━┻━┛
//
// ---------------------------------------------------------------

import com.rjx.model.YellowDuck;

import java.util.List;

public interface YellowDuckDao
{
    /*增加*/
    public void insert(YellowDuck yellowDuck);

    /*删除*/
    public void delete(int yellowDuckId) throws Exception;

    /*修改*/
    public void update(YellowDuck yellowDuck);

    /*查询*/
    public YellowDuck queryYellowDuck(int yellowDuckId);

    /*查询所有*/
    public List<YellowDuck> queryAllYellowDucks();

}