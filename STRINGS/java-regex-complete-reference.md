# Java Regex — Complete Reference

All patterns below are written as they appear in **Java string literals** (so `\d` becomes `\\d`, etc.) unless noted otherwise.

---

## 1. Character Classes

| Pattern | Matches |
|---|---|
| `[abc]` | `a`, `b`, or `c` |
| `[^abc]` | Any character **except** `a`, `b`, `c` |
| `[a-z]` | Any lowercase letter a–z |
| `[A-Z]` | Any uppercase letter A–Z |
| `[a-zA-Z]` | Any letter |
| `[0-9]` | Any digit |
| `[a-zA-Z0-9]` | Any alphanumeric character |
| `[a-d[m-p]]` | Union: a–d or m–p |
| `[a-z&&[def]]` | Intersection: only d, e, f |
| `[a-z&&[^bc]]` | Subtraction: a–z except b, c |
| `[a-z&&[^m-p]]` | Subtraction: a–z except m–p |

---

## 2. Predefined Character Classes (Shorthand)

| Pattern | Meaning |
|---|---|
| `.` | Any character (except line terminator, unless `DOTALL` flag used) |
| `\\d` | Digit: `[0-9]` |
| `\\D` | Non-digit: `[^0-9]` |
| `\\w` | Word character: `[a-zA-Z_0-9]` |
| `\\W` | Non-word character |
| `\\s` | Whitespace: `[ \t\n\x0B\f\r]` |
| `\\S` | Non-whitespace |
| `\\h` | Horizontal whitespace |
| `\\H` | Non-horizontal-whitespace |
| `\\v` | Vertical whitespace (line terminator) |
| `\\V` | Non-vertical-whitespace |
| `\\R` | Any Unicode linebreak sequence |
| `\\N{name}` | Named Unicode character |

---

## 3. POSIX Character Classes (US-ASCII only)

| Pattern | Meaning |
|---|---|
| `\\p{Lower}` | Lowercase letter `[a-z]` |
| `\\p{Upper}` | Uppercase letter `[A-Z]` |
| `\\p{ASCII}` | All ASCII `[\x00-\x7F]` |
| `\\p{Alpha}` | Alphabetic `[a-zA-Z]` |
| `\\p{Digit}` | Decimal digit `[0-9]` |
| `\\p{Alnum}` | Alphanumeric `[\p{Alpha}\p{Digit}]` |
| `\\p{Punct}` | Punctuation: `` !"#$%&'()*+,-./:;<=>?@[\]^_`{\|}~ `` |
| `\\p{Graph}` | Visible character `[\p{Alnum}\p{Punct}]` |
| `\\p{Print}` | Printable character `[\p{Graph}\x20]` |
| `\\p{Blank}` | Space or tab `[ \t]` |
| `\\p{Cntrl}` | Control character |
| `\\p{XDigit}` | Hexadecimal digit `[0-9a-fA-F]` |
| `\\p{Space}` | Whitespace `[ \t\n\x0B\f\r]` |

## 3a. Unicode Categories & Blocks

| Pattern | Meaning |
|---|---|
| `\\p{L}` | Any Unicode letter |
| `\\p{N}` | Any Unicode digit |
| `\\p{IsAlphabetic}` | Unicode alphabetic |
| `\\p{Sc}` | Currency symbol |
| `\\p{InGreek}` | Character in Greek block |
| `\\p{Lu}` | Uppercase letter (Unicode) |
| `\\p{Ll}` | Lowercase letter (Unicode) |

---

## 4. Quantifiers

### Greedy (default — match as much as possible)
| Pattern | Meaning |
|---|---|
| `X?` | 0 or 1 time |
| `X*` | 0 or more times |
| `X+` | 1 or more times |
| `X{n}` | Exactly n times |
| `X{n,}` | At least n times |
| `X{n,m}` | Between n and m times |

### Reluctant / Lazy (match as little as possible — add `?`)
| Pattern | Meaning |
|---|---|
| `X??` | 0 or 1, lazily |
| `X*?` | 0 or more, lazily |
| `X+?` | 1 or more, lazily |
| `X{n,m}?` | Between n and m, lazily |

### Possessive (match greedily, no backtracking — add `+`)
| Pattern | Meaning |
|---|---|
| `X?+` | 0 or 1, possessive |
| `X*+` | 0 or more, possessive |
| `X++` | 1 or more, possessive |
| `X{n,m}+` | Between n and m, possessive |

---

## 5. Boundary Matchers (Anchors)

| Pattern | Meaning |
|---|---|
| `^` | Start of line |
| `$` | End of line |
| `\\b` | Word boundary |
| `\\B` | Non-word-boundary |
| `\\A` | Start of input (entire string) |
| `\\Z` | End of input, before final line terminator |
| `\\z` | Very end of input |
| `\\G` | End of previous match |

---

## 6. Logical Operators

| Pattern | Meaning |
|---|---|
| `XY` | X followed by Y (concatenation) |
| `X\|Y` | X or Y (alternation) |
| `(X)` | Capturing group |

---

## 7. Groups & Capturing

| Pattern | Meaning |
|---|---|
| `(X)` | Capturing group — accessible via `group(1)`, etc. |
| `(?<name>X)` | Named capturing group — accessible via `group("name")` |
| `(?:X)` | Non-capturing group |
| `\\1`, `\\2` … | Backreference to capture group 1, 2, etc. |
| `\\k<name>` | Backreference to named group |

---

## 8. Lookahead / Lookbehind (Special Constructs)

| Pattern | Meaning |
|---|---|
| `(?=X)` | Positive lookahead — X must follow, not consumed |
| `(?!X)` | Negative lookahead — X must NOT follow |
| `(?<=X)` | Positive lookbehind — X must precede, not consumed |
| `(?<!X)` | Negative lookbehind — X must NOT precede |
| `(?>X)` | Independent (atomic) group — no backtracking into X |
| `(?idmsuxU-idmsuxU)` | Inline flag toggle (nongroup) |
| `(?idmsuxU-idmsuxU:X)` | Inline flag toggle scoped to group |

---

## 9. Pattern Flags

Used with `Pattern.compile(regex, flag)`:

| Flag | Constant | Inline | Meaning |
|---|---|---|---|
| Case insensitive | `Pattern.CASE_INSENSITIVE` | `(?i)` | Ignore case |
| Multiline | `Pattern.MULTILINE` | `(?m)` | `^`/`$` match line boundaries, not just string boundaries |
| Dotall | `Pattern.DOTALL` | `(?s)` | `.` matches line terminators too |
| Unicode case | `Pattern.UNICODE_CASE` | `(?u)` | Unicode-aware case folding |
| Comments | `Pattern.COMMENTS` | `(?x)` | Whitespace & `#` comments ignored in pattern |
| Literal | `Pattern.LITERAL` | — | Treat pattern as literal string |
| Canon equivalence | `Pattern.CANON_EQ` | — | Unicode canonical equivalence |
| Unix lines | `Pattern.UNIX_LINES` | `(?d)` | Only `\n` treated as line terminator |

---

## 10. Java Regex API — Common Methods

### `String` class
```java
str.matches(regex)                       // full-string match, returns boolean
str.replaceAll(regex, replacement)       // replace all matches
str.replaceFirst(regex, replacement)     // replace first match
str.split(regex)                         // split into array
str.split(regex, limit)                  // split with limit
```

### `Pattern` / `Matcher` classes
```java
Pattern p = Pattern.compile(regex);
Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

Matcher m = p.matcher(input);

m.matches()          // entire input matches
m.find()              // find next subsequence match
m.find(start)         // find from given index
m.lookingAt()         // match starting at beginning (not full string)
m.group()             // full matched text
m.group(n)            // text of group n
m.group("name")       // text of named group
m.groupCount()        // number of capturing groups
m.start()             // start index of match
m.end()                // end index of match
m.reset()              // reset matcher
m.replaceAll(repl)    // replace all matches
m.replaceFirst(repl)  // replace first match
Pattern.quote(str)    // escape all regex metacharacters in str
```

---

## 11. Escaping Special Characters

These characters have special meaning and must be escaped with `\\` to be literal:

```
.  ^  $  |  ?  *  +  (  )  [  ]  {  }  \
```

Example: to match a literal dot → `\\.`
To match a literal backslash → `\\\\`
Use `Pattern.quote(s)` to safely escape an entire dynamic string.

---

## 12. Common Practical Patterns

| Purpose | Pattern |
|---|---|
| Email (basic) | `^[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}$` |
| Email (stricter) | `^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$` |
| URL | `^(https?\|ftp)://[^\\s/$.?#].[^\\s]*$` |
| IPv4 address | `^(\\d{1,3}\\.){3}\\d{1,3}$` |
| IPv4 (strict, 0-255) | `^(25[0-5]\|2[0-4]\\d\|1\\d{2}\|[1-9]?\\d)(\\.(25[0-5]\|2[0-4]\\d\|1\\d{2}\|[1-9]?\\d)){3}$` |
| Hex color code | `^#([A-Fa-f0-9]{6}\|[A-Fa-f0-9]{3})$` |
| Date (yyyy-MM-dd) | `^\\d{4}-\\d{2}-\\d{2}$` |
| Date (dd/MM/yyyy) | `^\\d{2}/\\d{2}/\\d{4}$` |
| Time (HH:mm:ss, 24h) | `^([01]\\d\|2[0-3]):[0-5]\\d:[0-5]\\d$` |
| Alphanumeric only | `^[a-zA-Z0-9]+$` |
| Only letters | `^[a-zA-Z]+$` |
| Only digits | `^\\d+$` |
| Integer (signed) | `^[+-]?\\d+$` |
| Decimal number | `^[+-]?\\d+(\\.\\d+)?$` |
| Password (min 8, 1 upper, 1 lower, 1 digit, 1 special) | `^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$` |
| Username (alnum + underscore, 3-16 chars) | `^[a-zA-Z0-9_]{3,16}$` |
| HTML tag | `<([a-z]+)([^<]+)*(?:>(.*)<\\/\\1>\|\\s+\\/>)` |
| Whitespace-only string | `^\\s*$` |
| No leading/trailing whitespace | `^\\S.*\\S$\|^\\S$` |
| Repeated word | `\\b(\\w+)\\s+\\1\\b` |
| Extract words | `\\b\\w+\\b` |
| Split on multiple delimiters | `[,;\\s]+` |
| File extension | `\\.([a-zA-Z0-9]+)$` |
| Windows file path | `^[a-zA-Z]:\\\\(?:[^\\\\/:*?"<>\|\\r\\n]+\\\\)*[^\\\\/:*?"<>\|\\r\\n]*$` |
| Comma-separated numbers | `^\\d+(,\\d+)*$` |
| Credit card (basic, 13-19 digits) | `^\\d{13,19}$` |
| MAC address | `^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$` |
| UUID | `^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$` |

---

## 13. India-Specific Patterns

| Purpose | Pattern |
|---|---|
| Indian mobile number (10 digit, starts 6-9) | `^[6-9]\\d{9}$` |
| Indian mobile with +91 | `^(\\+91[\\-\\s]?)?[6-9]\\d{9}$` |
| PAN card | `^[A-Z]{5}[0-9]{4}[A-Z]{1}$` |
| Aadhaar number (12 digit, no leading 0/1) | `^[2-9]\\d{3}\\s?\\d{4}\\s?\\d{4}$` |
| IFSC code | `^[A-Z]{4}0[A-Z0-9]{6}$` |
| PIN code (postal) | `^[1-9][0-9]{5}$` |
| GSTIN | `^[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9A-Z]{1}Z[0-9A-Z]{1}$` |
| Vehicle registration | `^[A-Z]{2}[ -]?[0-9]{1,2}[ -]?[A-Z]{1,2}[ -]?[0-9]{4}$` |

---

## 14. Quick Example Usage

```java
// Validate
boolean isValid = "test@example.com".matches("^[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}$");

// Extract all matches
Pattern p = Pattern.compile("\\d+");
Matcher m = p.matcher("Order 123, Item 456");
while (m.find()) {
    System.out.println(m.group()); // 123, then 456
}

// Named groups
Pattern p2 = Pattern.compile("(?<year>\\d{4})-(?<month>\\d{2})-(?<day>\\d{2})");
Matcher m2 = p2.matcher("2026-08-18");
if (m2.matches()) {
    System.out.println(m2.group("year"));  // 2026
    System.out.println(m2.group("month")); // 08
}

// Split with multiple delimiters
String[] parts = "a, b; c d".split("[,;\\s]+"); // [a, b, c, d]

// Replace with backreference
String swapped = "John Smith".replaceAll("(\\w+) (\\w+)", "$2 $1"); // Smith John
```
