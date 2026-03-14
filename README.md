# Git Version Control Lab

## Project Structure

```
git-lab-project/
├── pom.xml                          ← Maven project file (for STS import)
├── notes.txt                        ← Step-by-step Git commands & notes
└── src/
    └── main/
        └── java/
            └── com/gitlab/
                └── Main.java        ← Java source with task annotations
```

## How to Import into Spring Tool Suite (STS)

1. Open STS
2. Go to **File → Import**
3. Select **Maven → Existing Maven Projects**
4. Click **Browse** and navigate to the extracted `git-lab-project` folder
5. Check `pom.xml` and click **Finish**

## Lab Tasks Summary

| Task | Description |
|------|-------------|
| 1 | `git init` + configure username & email |
| 2 | Create files, `git status`, `git add` |
| 3 | `git commit -m "Initial commit"` |
| 4 | Create GitHub repo, `git remote add`, `git push` |
| 5 | `git checkout -b feature-update`, modify, commit |
| 6 | `git checkout -b bug-fix`, modify, commit |
| 7 | `git checkout main`, merge both branches |
| 8 | Resolve conflict, `git add`, `git commit` |

## Files to Modify During Lab

- **`Main.java`** — Edit `getFeatureMessage()` in Task 5 and add a comment in Task 6
- **`notes.txt`** — Use as reference throughout the lab

See `notes.txt` for the exact commands to run at each step.
