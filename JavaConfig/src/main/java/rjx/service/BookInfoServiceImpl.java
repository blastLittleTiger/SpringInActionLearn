package rjx.service;
//
// -------------------------------------------------------------
//
// Author:prayjourney
// Purpose:
// Name:BookInfoServiceImpl
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

import rjx.dao.BookDaoImpl;
import rjx.model.Book;

//@Service("bookService")
public class BookInfoServiceImpl implements BookInfoService
{
    private static final String TAG = "BookInfoServiceImpl";


    public void printbookinfo(Book book)
    {
        book.setPublicationDate(new DataServiceImpl().getPublicationDate());
        new BookDaoImpl().saveInDatabase(book);
    }
}