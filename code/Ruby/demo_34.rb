puts "-BEGIN END------------------------------"

BEGIN {puts"1"}
BEGIN {puts"2"}
BEGIN {puts"3"}
BEGIN {puts"4"}
BEGIN {puts"5"}


at_exit{puts"a"}
at_exit{puts"b"}
at_exit{puts"c"}
at_exit{puts"d"}
at_exit{puts"e"}



END{puts"6"}
END{puts"7"}
END{puts"8"}
END{puts"9"}
END{puts"10"}