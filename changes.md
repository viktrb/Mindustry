                                        -- Additive --

These are not necessarily new functionality / features , could be argued as improving current ones (?)

Additive 1 - Add new abilites - core/src/mindustry/entities/abilities
Additive 2 - Add new units - core/src/mindustry/content/UnitTypes
Additive 3 - Add new maps - core/src/mindustry/maps (either create generators or modify/create maps by hand)

Fix missing translations? ( I can do swedish and a little german - core/assets/bundles has the localisations )

Many additional opportunities in core/src/mindustry/content for improveming or adding features

                                        -- Corrective --

Play game to look for bugs/issues
Look online forums / github issues for reported problems

Potential todo items to refactor
//TODO if the save is unloaded or map is hosted, these blocks do not get built. -- Control.java

                                        -- Perfective --

Perfective 1 - Big gaps in documentation (i.e. 'I hate java' followed by non descriptive code blocks)
Perfective 2 - Update/add unit tests for all (some) modules, current testbench has few but very large tests
    Example - Unit tests for async module (core/src/mindustry/async)
                Could not find explicit tests for these


Completed:
    Refactored SerpuloPlanetGenerator.java (added generateShoreline to generate)
    Refactored checkgamestate in logic.java
    Started adding some helper mobile functions
    