package rjx.service;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:DateServiceImpl
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

import org.joda.time.LocalDate;


/*@Service注解标注这个类为业务层自动检测的bean，后续我们会将其注入到主服务bean中*/
//@Service("dataService")
public class DataServiceImpl implements DataService
{
    private static final String TAG = "DateServiceImpl";


    public LocalDate getPublicationDate()
    {
        return new LocalDate(1978, 8, 24);
    }
}