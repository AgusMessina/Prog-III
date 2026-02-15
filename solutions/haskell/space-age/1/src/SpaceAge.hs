module SpaceAge (Planet(..), ageOn) where

data Planet = Mercury
            | Venus
            | Earth
            | Mars
            | Jupiter
            | Saturn
            | Uranus
            | Neptune

ageOn :: Planet -> Float -> Float
ageOn planet seconds = seconds / (segundosTerrestres * periodoOrbital planet)
    where
    segundosTerrestres = 31557600.0

    periodoOrbital :: Planet -> Float
    periodoOrbital Mercury = 0.2408467
    periodoOrbital Venus = 0.61519726
    periodoOrbital Earth = 1.0
    periodoOrbital Mars = 1.8808158
    periodoOrbital Jupiter = 11.862615
    periodoOrbital Saturn = 29.447498
    periodoOrbital Uranus = 84.016846
    periodoOrbital Neptune = 164.79132
                    