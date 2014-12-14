General
======
Continuous Integration (CI) is a development opportunity to integrate code into a shared repository several times a day.
Because you are integrating your code parts repeadedly there is less back-tracking to discover bugs so that you have more time to build new features.

CI is cheap because you have so short periods between integrations in comparison with non-CI techniques, where you integrate only all 2 days for instance which makes it more difficult to find and fix bugs.
CI also encourages team communication, lets you build a solid  base and shortens the waiting if your code would work or not.

Pracitces
========
With CI you can maintain a single source repository, make your build self-testing, keep the build process fast and make it easy for everyone to see what is happening. You also can react to your
customers' / users' whishes problems in a short amount of time which makes it easier for them and for you. You can also enroll new Updates faster if they changed code passes the auto-generated tests (see below how this is done).

How CI works
===========
Every devolper checks out the code he should modify into its private workspace. When he is done with modification, he commits the changes to the shared repository.
Then the CI Server takes action by monitoring the repository, building the system and tests, labeling the build version and informing the team of the successfull new build.
If the build or tests fail, the CI Server informs the team which should try to fix the issue at the earliest opportunity. Meanwhile, other team members should continue with integrating their code parts.