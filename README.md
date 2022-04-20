# NIS_Project
A fake company to calculate NIS contributions for staff


813117991

### Assumptions

1) ID num must not be NULL or start with 0,maxlength=6.
2) First Name and Last name must not contain any numbers or be NULL and maxlength=20.
3) NIS number cannot start with a 0 or be NULL, maxlength=8 ,it can have a value of 0 in the event that the employee doesn't have the number present.
4) Figures for weeks have a maxlength=7 and can only contain numbers.
6) there can be employees with $0 for the weekly salary figues,these would be called volunteers at the company.
7) Edit can be used as a search as well.
8) The Employee ID cannot be edited from the front-end.
9) A user cannot edit the NIS information.


