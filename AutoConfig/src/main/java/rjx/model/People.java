package rjx.model;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:People
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

/*实体类People*/

public class People
{

    private int id;

    private String name;

    private LocalDate assessmentDate;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public LocalDate getAssessmentDate()
    {
        return assessmentDate;
    }

    public void setAssessmentDate(LocalDate assessmentDate)
    {
        this.assessmentDate = assessmentDate;
    }

    @Override
    public String toString()
    {
        return "People [id=" + id + ", name=" + name + ", assessmentDate=" + assessmentDate + "]";
    }

}