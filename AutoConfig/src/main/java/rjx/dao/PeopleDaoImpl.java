package rjx.dao;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:PeopleDaoImpl
// Date:2017/5/4.
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

import org.springframework.stereotype.Repository;
import rjx.model.People;

/*标注该类作为一个持久层自动检测的bean，参数peopleDao为bean提供了一个名字，我们将会在主服务Bean里注入该bean*/

@Repository("peopleDao")
public class PeopleDaoImpl implements PeopleDao
{
    private static final String TAG = "PeopleDaoImpl";

    public void saveInDatabase(People people)
    {
        /*实际之中会存储在数据库之中*/
        System.out.println("People: " + people.getName() + " is registered for assessment on " +
                people.getAssessmentDate());
    }
}