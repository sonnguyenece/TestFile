with SEARCH_NAME as (
    select d.*,
           TRANSLATE(
                   NAME,
                   'aAàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬ' || 'bB' || 'cC' || 'dDđĐ' || 'eEèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆ'
                       || 'fF' || 'gG' || 'hH' || 'iIìÌỉỈĩĨíÍịỊ' || 'jJ' || 'kK' || 'lL' || 'mM' || 'nN' ||
                   'oOòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢ' || 'pP' || 'qQ' || 'rR' || 'sS' || 'tT' ||
                   'uUùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰ' || 'vV' || 'wW' || 'xX' || 'yYỳỲỷỶỹỸýÝỵỴ',
                   'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa' || 'bb' || 'cc' || 'dddd' || 'eeeeeeeeeeeeeeeeeeeeeeee' ||
                   'ff' || 'gg' || 'hh' || 'iiiiiiiiiiii' || 'jj' || 'kk' || 'll' || 'mm' || 'nn' ||
                   'oooooooooooooooooooooooooooooooooooo' || 'pp' || 'qq' || 'rr' || 'ss' || 'tt' ||
                   'uuuuuuuuuuuuuuuuuuuuuuuu' || 'vv' || 'ww' || 'xx' || 'yyyyyyyyyyyy'
               ) REPLACE_NAME
    from DISTRICTS d
)
select *
from SEARCH_NAME
where lower(REPLACE_NAME) like lower('%' || :searchKey || '%')
   or lower(NAME) like lower('%' || :searchKey || '%');




