package leave;

public class Director implements LeaveApproval {
    @Override
    public int allowedLeaveDays() {
        return 3;
    }

    @Override
    public boolean approveLeave(int days) {
        if (days > allowedLeaveDays()) {
            System.out.println("主任审批请假不通过!");
            return false;
        }
        System.out.println("主任审批请假通过!");
        return true;
    }
}
