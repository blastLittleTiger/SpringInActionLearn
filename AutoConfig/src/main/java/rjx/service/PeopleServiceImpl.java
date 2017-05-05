package rjx.service;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:EmployeeServiceImpl
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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rjx.dao.PeopleDao;
import rjx.model.People;

/*PeopleService是我们的主服务类，可以看到，我们往这个类注入了DateService和PeopleDao。
被@Autowired注解标注的dateService属性，会被Spring的依赖注入自动装配合适的Bean，
由于我们已经使用@Service声明了一个DateService Bean，所以该Bean将会被注入到这里。
类似的，被@Repository标注的PeopleDao也会被注入到peopleDao属性中。*/

@Service("peopleService")
public class PeopleServiceImpl implements PeopleService
{
    private static final String TAG = "EmployeeServiceImpl";
    @Autowired
    private DateService dateService;//如果此处不用@Autowired，该怎么操作呢？

    @Autowired
    private PeopleDao peopleDao;


    public void registerEmployee(People people)
    {
        people.setAssessmentDate(dateService.getNextAssessmentDate());
        peopleDao.saveInDatabase(people);
    }
}