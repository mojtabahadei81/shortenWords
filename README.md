<p align="right">text</p>

# حذف حروف تکراری
در این پروژه میخواهیم با انجام عملیاتی ، کلمه ها را کوتاه کنیم. این عملیات
بدین صورت است که k حرف تکراری پشت سر هم که در کلمه آمده اند حذف می شود و این عملیات آنقدر تکرار می شود تا دیگر قادر به انجام آن نباشیم

پیاده‌سازی:
برنامه شما شامل یک متد
است که یک رشته را برمی گرداند.

##   ورودی 
ابتدا عدد n به تابع داده می شود که همان تعداد حروف تکراری پشت سر هم که می توان حذف کرد را نشان می دهد.
سپس رشته مد نظر که می خواهیم آن را کوتاه کنیم به تابع داده می شود.

## خروجی
رشته کوتاه شده برگردانده می شود.

## مثال
در اینجا چند نمونه برای فهم بهتر صورت سوال و قالب ورودی و خروجی تست‌ها داده می‌شود.

### ورودی نمونه ۱
```
2
fariboorzfarinaaz
```
### خروجی نمونه ۱
```
faribrzfarinz
```

### ورودی نمونه 2
```
2
ffariroorzfarinaaaz
```
###خروجی نمونه 2
```
arizfarinaz
```
با اعمال یک بار عملیات، ffariroorzfarinaaaz به arirrzfarinaz تبدیل می شود. با اعمال یک بار دیگر عملیات، به کلمه arizfarinaz می رسیم.