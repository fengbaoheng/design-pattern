package leave;

public interface LeaveApproval {
    int allowedLeaveDays();

    boolean approveLeave(int days);
}
