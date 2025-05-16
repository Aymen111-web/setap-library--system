# Library Management System

This project demonstrates Git workflow for a Java library management system.

## Git Workflow

### Basic Commands Used:
- git init: Initialized a new Git repository
- git add .: Staged all files for commit
- git commit -m "message": Created version snapshots
- git push: Sent local commits to GitHub
- git pull: Fetched remote changes
- git branch: Created and managed branches

### Branching and Merging Flow:
1. Created main branch with initial code
2. Made feature branch: git checkout -b LoanManagement
3. Developed loan functionality in the branch
4. Pushed branch: git push -u origin LoanManagement
5. Created PR on GitHub
6. After review, merged PR into main
7. Synced local main with git pull origin main

## Loan Features
- Book borrowing with due dates
- Return book functionality
- Overdue status checking
- Input validations