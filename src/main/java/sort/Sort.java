package sort;

import java.util.List;

/**
 * packageName : sort
 * fileName : Sort
 * author : psjw
 * date : 2022-05-09
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2022-05-09        psjw         최초 생성
 */
public interface Sort <T extends Comparable<T>>{
    List<T> sort(List<T> list);
}
