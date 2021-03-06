/*
 *
 *  * Copyright © 2016 @ Pablo Grela
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package justforcommunity.radiocom.utils;

import android.util.Log;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class DateUtils {

    public static final String FORMAT_DISPLAY = "dd/MM/yyyy HH:mm ";
    public static final String FORMAT_DATE = "dd/MM/yyyy";
    public static final String FORMAT_DATE_GET = "yyyy-MM-dd";
    public static final String FORMAT_HOUR = "HH:mm";
    public static final String FORMAT_DAY_WEEK = "EEEE";

    public static String formatDate(Date date, String format) {
        if (date != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            return dateFormat.format(date);
        }
        return null;
    }

    public static Date formatDate(String date, String format) {
        if (date != null && !date.isEmpty()) {
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            try {
                return dateFormat.parse(date);
            } catch (ParseException e) {
                Log.d("DateUtils", "format", e);
            }
        }
        return null;
    }

    public static String formatDate(Calendar date, String format) {
        if (date != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            return dateFormat.format(date.getTime());
        }
        return null;
    }

    public static String formatDateWithLocale(Calendar date, String format, Locale locale) {
        if (date != null) {
            DateFormat formatter = new SimpleDateFormat(format, locale);
            return formatter.format(date.getTime());
        }
        return "";
    }
}
