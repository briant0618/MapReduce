package sub1;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

// Reduce �����ϴ� Class
public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable> { 

}
