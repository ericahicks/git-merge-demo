# git-merge-demo
This project is for practicing git branching, git merging, and pull requests.

## Contributing Code

If you are contributing new code, do not work directly on the main branch. Instead, create a new branch and work on it by using:

```
git checkout -b my-branch
```

Regularly save your work and back it up by doing 

```
git add .
git commit -m "what i did"
git push origin my-branch
```

Maybe every day or every other day talk to your team about combining your code into the main branch by doing a [pull request on GitHub](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/creating-a-pull-request#creating-the-pull-request).

## Incorporating Changes on Main into your Local Repository Branch

To get the latest version of the code into your local branch, update your local main branch from the remote main branch by doing

```
git pull origin main
```

Then incorporate the new code on your local main branch into your local personal development branch by doing

```
git checkout my-branch
git merge main
```

And that's it! (You may have to resolve merge conflicts see [here](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/addressing-merge-conflicts/resolving-a-merge-conflict-on-github))
