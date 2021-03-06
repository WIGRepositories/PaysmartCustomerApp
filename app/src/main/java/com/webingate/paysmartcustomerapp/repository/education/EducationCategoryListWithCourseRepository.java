package com.webingate.paysmartcustomerapp.repository.education;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.webingate.paysmartcustomerapp.object.EducationCategoryListWithCourse;

import java.util.List;

/**
 * Created by Panacea-Soft on 8/25/18.
 * Contact Email : teamps.is.cool@gmail.com
 */


public class EducationCategoryListWithCourseRepository {

    public static List<EducationCategoryListWithCourse> getCategoryList() {
        return new Gson().fromJson(json, new TypeToken<List<EducationCategoryListWithCourse>>() {
        }.getType());
    }

    static String json = "[\n" +
            "  {\n" +
            "    \"category_name\":\"Business\",\n" +
            "    \"course_list\":[\n" +
            "      {\n" +
            "        \"course_name\": \"Digital Lifestyle\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"course_name\": \"Professional Development\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"course_name\": \"Marketing\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"course_name\": \"Leadership + Management\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category_name\":\"Technology\",\n" +
            "    \"course_list\":[\n" +
            "      {\n" +
            "        \"course_name\": \"User Experience\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"course_name\": \"IT Infrastructure\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"course_name\": \"Software Development\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category_name\":\"Creative\",\n" +
            "    \"course_list\":[\n" +
            "      {\n" +
            "        \"course_name\": \"Graphic Design\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"course_name\": \"Motion Graphics and VFX\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"course_name\": \"Photography\"\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "\n" +
            "]";
}
